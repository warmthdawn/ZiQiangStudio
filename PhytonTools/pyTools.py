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
    n = int(input("请输入键值对的个数："))
    myDict = {}
    for i in range(n):
        s=input('请输入第'+str(i)+'个值(键和值用空格分开)')
        con = s.split()
        myDict[con[0]] = con[1]

    # 将字典转换成JSON字符串
    jEnco = json.JSONEncoder()
    oldJson = jEnco.encode(myDict)

    print('你输入的内容是'+oldJson)

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
    print('反转后的新列表为'+newJson)


# 二维码生成
def qrGenerator():
    filePath = input('请输入文件路径：')
    # 读取txt文件
    ioText=open(filePath)
    s = ioText.read()
    ioText.close()
    # 生成二维码
    r = make(s)
    # 处理一下输入的文件名
    saveFile = os.path.splitext(filePath)[0] + '.jpg'
    # img.save(saveFile,'JPEG')
    r.save(saveFile,'JPEG')



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



