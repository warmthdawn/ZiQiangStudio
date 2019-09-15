from base64 import b64decode
import binascii
b64str = input("请输入base64字符串：")
try:
    b64bts = b64str.encode()
    bts = b64decode(b64bts,None,True)
    r = bts.decode("UTF-8")
    print(r)
except binascii.Error:
    print("你输入的字符有误，请检查")