from qrcode import make
import os
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


qrGenerator()