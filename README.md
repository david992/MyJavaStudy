# MyJavaStudy
一、执行修改命令
git remote set-url origin <url>

二、先删除origin的指向，在add地址
git remote rm origin
git remote add origin <url>

三、直接修改config文件
.git>config>url=""

并发：同一时刻，多个指令在单个cpu上交替进行
并行：同一时刻，多个指令在多个cpu上同时进行