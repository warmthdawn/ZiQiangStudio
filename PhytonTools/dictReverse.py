import json

n = int(input("请输入键值对的个数："))
myDict = {}
for i in range(n):
    s=input('请输入第'+str(i)+'个值(键和值用空格分开)')
    con = s.split()
    myDict[con[0]] = con[1]

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


