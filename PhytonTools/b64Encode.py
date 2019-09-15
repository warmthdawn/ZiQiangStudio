from base64 import b64encode
s=input("请输入要编码的字符串：")
bts = s.encode("UTF-8")
r = str(b64encode(bts),"UTF-8")
print(r)