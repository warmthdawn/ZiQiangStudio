from qrcode import make
import os
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
