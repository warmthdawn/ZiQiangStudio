from base64 import b64decode
import binascii
from base64 import b64encode
import json
from qrcode import make
import os

# base64编码
def b64Encode():
    s=input("请输入要编码的字符串：")
    bts = s.encode("UTF-8")
    r = str(b64encode(bts),"UTF-8")
    print(r)

# base64解码
def b64Decode():
    b64str = input("请输入base64字符串：")
    # 对非法输入做异常处理（憋说了，我知道我偷懒）
    b64str = b64str.strip()
    try:
        b64bts = b64str.encode()
        bts = b64decode(b64bts,None,True)
        r = bts.decode("UTF-8")
        print(r)
    except binascii.Error:
        print("你输入的字符有误，请检查")

# 字典反转
def dictReverse():

    # 读取字典
    # 对非法输入做异常处理
    ins = input("请输入键值对的个数：")
    if not ins.isdigit():
        print('你输入的数据有误！')
        return
    n=int(ins)
    
    myDict = {}
    # for i in range(n):
    i=0
    while i<n:
        s=input('请输入第'+str(i)+'个值(键和值用空格分开)')
        # 对非法输入进行异常处理
        con = s.split()
        if len(con) != 2:
            print('你输入的数据有误，刚刚输入的',s,'未加入字典！')
            continue
        myDict[con[0]] = con[1]
        i=i+1

    # 将字典转换成JSON字符串
    jEnco = json.JSONEncoder()
    oldJson = jEnco.encode(myDict)

    print('你输入的字典JSON是',oldJson)

    # 下面进行字典反转
    newDict = {}
    for item in myDict.items():
        # 判断列表中是否存在元素
        if item[1] in newDict:
            # 判断已经存在的元素是否为列表
            if(isinstance(newDict[item[1]],list)):
                myList = newDict[item[1]]
                myList.append(item[0])
            else:
                # 否，创建新列表
                myList = []
                myList.append(newDict[item[1]])
                myList.append(item[0])
                newDict[item[1]]=myList
        else:
            newDict[item[1]] = item[0]

    newJson = jEnco.encode(newDict)
    print('反转后的新字典的JSON为',newJson)

    # 输出类型
    print('字典类型为',type(newDict).__name__)
    print('JSON类型为',type(newJson).__name__)

# 二维码生成
def qrGenerator():
    filePath = input('请输入文件路径：')

    # 对非法输入进行异常处理
    if not os.path.exists(filePath):
        print('你输入的路径不正确！')
        return
    
    # 处理一下输入的文件名
    saveFile = os.path.splitext(filePath)[0] + '.jpg'
    if os.path.splitext(filePath)[1]!='.txt':
        print('你选择的文件不是*.txt文件！')
        return


    # 读取txt文件
    try:
        ioText=open(filePath)
        s = ioText.read()
    except:
        print('无法读取文件，请检查文件是否被占用及拥有读取权限，文件编码是否正确等等')
        return
    finally:
        ioText.close()

    # 生成二维码

    try:
        # 制作二维码
        r = make(s)
    except:
        print('二维码制作失败，请检查你的源文件')
        return
    
    try:
        # 保存前先检查文件是否存在，若是则删除
        if os.path.exists(saveFile):
            os.remove(saveFile)

        # 保存二维码
        r.save(saveFile,'JPEG')
        print('已将二维码保存为',saveFile)
    except:
        print('无法保存二维码，请确认源文件目录下的同名.jpg文件是否被占用')



print('欢迎使用Phyton小工具箱')
print('本工具箱拥有一下功能：')
print('1.Base64编码')
print('2.Base64解码')
print('3.字典读取反转并转换为JSON字符串')
print('4.二维码生成')

select = input('请选择你要使用的功能：')

if select=='1':
    b64Encode()
elif select=='2':
    b64Decode()
elif select=='3':
    dictReverse()
elif select=='4':
    qrGenerator()
else:
    print('你选择的选项有误。')




