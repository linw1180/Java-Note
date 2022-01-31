### Java 小记
#### 快捷操作
* 鼠标放类上，快捷键 Ctrl + H 查看其继承关系
* 创建对象时，如使用 new Cat().var 回车即可快速分配变量名为 Cat cat = new Cat();
* 选中一段代码，使用 Ctrl + Alt + T 对这段代码进行快速编辑（如加程序控制结构或异常处理结构等）
* 按下 Ctrl + J 可查看所有快捷键（如 itit 回车，可快捷构造出迭代器的循环语句）
```
while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
```
* 在某个类中，可使用 Ctrl + F12 快速定位某个方法或者属性
* Alt + Shift + Insert 可进行多行编辑
* 选中一个类，用 Ctrl + Alt + U 可快捷查看其继承结构图 

#### 知识点小记
* 全局变量(属性)可以不赋值，直接使用，因为有默认值
* 局部变量必须赋值后，才能使用，因为没有默认值
* 局部变量只能在本类中对应的方法中使用
---

# 知识点
### 多线程
**核心点：线程安全**
* 创建线程的两种方式
* 线程生命周期
* 获取、修改线程名
* 获取当前线程对象
* 静态方法 sleep()
* 通过异常终止线程的睡眠 interrupt()
* 强行终止线程
* 合理终止线程的方式
* 了解（静态方法，让位 yield()；实例方法 join()，合并线程）
* 线程安全
* 同步异步
* 线程安全之账户取款
* 同步代码块
* 守护线程
* 定时器
* 实现线程的第三种方式：FutureTask 方式，实现 Callable 接口（JDK8 新特性）
* 关于 Object 类中的 wait() 和 notify()，生产者和消费者模式
---

### 反射
**核心点：怎么通过反射获取修改类的属性以及调用方法**
* 获取 Class 的三种方式【掌握】
* 利用反射机制通过配置文件实例化对象（不创建流和获取绝对路径，直接以流的形式返回，进行 load(流)）
* Class.forName(完整类名) 会导致类加载，实现只让静态代码块执行（jdbc 中会用到）
* 获取类路径（项目 src 下文件夹）下文件的绝对路径通用方式
* 使用资源绑定器代替 IO+Properties 获取属性配置文件

反射机制必须掌握：Method > Field > Constructor
* 通过反射机制调用对象的方法【必须掌握 must be !】
* 通过反射机制获取和修改对象的属性
* 通过反射机制调用对象的构造方法创建对象
* 通过反射获取指定类的父类以及实现的接口
* 获取Class的三种方式
---

### 注解
* 官方的两个注解：@Deprecated （已过时的），@Override（监测是否是重写父类的方法）
* 元注解：注解注解的注解（用在注解的上面）

需掌握的四个注解：（两个官方注解，两个元注解）
1. @Override 监测是否是重写父类的方法
2. @Deprecated 已过时的；不建议使用的
3. @Targer 元注解，用来标注”被标注的注解“可以出现的位置，如方法、类、属性上等...
4. @Retention 元注解，用来标注”被标注的注解“最终保存的位置，如源文件、字节码文件中等...

自定义注解：
1. 自定义属性时，没赋默认值的话，使用的时候必须手动给属性进行赋值
2. 赋默认值的属性，使用的时候可以不写
3. 如果一个注解的属性名是value，并且只有一个属性的话，使用的时候，value可省略不写
4. 注解当中的类型可以有哪些？
   byte、short、int、long、float、double、boolean、char、String、Class、枚举类型
   以及以上所列的每一种的数组形式。
5. 使用时，如果某属性是一个数组，并且数组中只有一个元素，则 {} 可以省略
6. 通过反射机制读取类上面的注解对象以及属性值
---

### MySQL
------------------ 操作mysql的命令 --------------------
cmd命令行中查看mysql版本：
mysql -V
mysql --version

登陆mysql：
mysql -uroot -pluis
mysql -uroot -p

在mysql中查看数据库版本：
select version();

查看所有数据库：
show databases;

切换数据库：
use xxx;

查看当前库中的表：
show tables;

查看其他库中的表：
show tables from 库名;

创建数据库：
create database xxx;

删除数据库：
drop database xxx;

导表：（需要先有数据库）
source sql脚本;

查看表结构：
desc 表名;

查看当前库：
select database();

终止一条语句：
\c

退出mysql：
exit 或 Ctrl + c

查看某建表语句：
show create table 表名;

----------- SQL语句 ----------
* 条件查询 between and
* 条件查询 is null 和 is not null
* and or
* 条件查询 in
* 模糊查询 like
* 数据排序 desc 和 asc
* 分组函数 group by
* 多字段分组查询
* group by 之 having 二次过滤
* 去除重复记录 distinct
* 判空函数 ifnull()
* 内连接、外连接、全连接
* 内连接：等值连接、非等值连接、自连接
* 外连接：左外连接、右外连接
* 多表连接查询
* 够用测试题：找出每一个员工的部门名称、工资等级以及上级领导（内连接和外连接之多表查询）
* select、where、from 后嵌套子查询（from后接子查询用的最多）
* union 数据拼接
* 分页查询 limit mysql特有
* desc asc 默认升序
* count(*) 分组函数/多行处理函数
* 分组函数（sum,count,max,min,avg）自动忽略null
* 分组函数不可直接用于while子句中，因为分组函数是在group by之后执行，而group by是在while之后执行
* ifnull() 空处理函数 有null参与的运算结果都为null
* count(*) 和 count(字段) 区别：
* count(*) 统计总记录条数
* count(字段) 统计不为null的该字段记录的条数
* 分组函数一般都会和group by联合使用
* 重要结论：当一条语句后面有group by的话，select后面只能跟分组函数和参与分组的字段，其他
* 字段不能跟，有的话会有问题！（mysql中无意义，oracle中直接报错。）
* 多字段联合分组：group by后使用逗号分隔，按照字段先后顺序进行分组。
* 查询结果去重用distinct关键字
* distinct出现在多字段最前面表示多字段联合去重
* 建表create、添加数据insert、修改数据update、删除数据delete、删除大表中数据truncate（留表头，删其他数据，不可回滚，永久删除）
* 表的复制create as select、表的删除drop

总结 DQL 语句执行顺序：
```mysql
select     5
	xxx
from       1
	xxx
where      2
	xxx
group by   3
	xxx
having     4
	xxx
order by   6
	xxx;
```

约束：
* 非空约束： not null 只存在列级
* 唯一性约束：unique 列级&表级（唯一不可重复，但是可以为null）
* 主键约束：primary key 列级&表级（唯一不可重复，且不可为null）
* 外键约束：foreign key(字段) reference 表名(一般填父表主键)

原则：
* 删除：先删除子表，再删除父表
* 建表：先创建父表，再创建子表
* 主键自增：primary key auto_increment

三大搜索引擎：
* MyISAM（不支持事务，但可压缩，占空间小，最常用的）
* InnoDB（支持事务，安全，但执行效率较低，mysql默认引擎）
* MEMORY（不支持事务，但查询效率最高，数据存在内存中，断电清空）

事务四大特性：
* 原子性：最小单元，不可再分
* 一致性：同时成功，同时失败
* 隔离性：四大隔离级别（读未提交、读已提交[oracle默认]、可重复读[mysql默认]、串行化读）

使用分组函数后，查询的时候只允许有参与分组的字段和分组函数，其他字段不允许写，
写了的话，其结果显示无意义。在oracle中会报错！

* DQL 数据查询语言 (Date Query Language) select
* DML 数据操控语言 (Date Manipulation Language) insert delete update
* DDL 数据定义语言 (Date Definition Language) create drop alter
* TCL 事务控制语言 (Transactional Control Language) commit rollback
* DCL 数据控制语言 (Data Control Language) grant revoke

数据库设计三范式：
* 第一范式：所有表必须有主键，每个字段原子性不可再分
* 第二范式：所有非主键字段完全依赖主键，不能产生部分依赖
* 第三范式：所有非主键字段完全依赖主键，不能产生传递依赖

口诀：
* 多对多，三张表，关系表两个外键。
* 一对多，两张表，多的表加外键。

目的：减少数据冗余

提醒：实际开发中，以满足客户需求为主，有时候会拿冗余换执行速度。
（多表联查会降低执行速度，放一起虽然冗余，但效率有时会高一些）

一对一设计两种方案：主键共享、外键唯一

情景：用户登录和用户详情，登录单独出一张表就不用查全部信息。

分组函数是在分完组后可用，所以可以用在having二次过滤中！！！

```mysql
select
	deptno,count(*)
from
	emp
group by
	deptno
having
	count(*) >= 5;
```
---

### JDBC
* jdbc 本质理解：针对 msql 的一套接口实现类库，实现 java 连接数据库；需要手动添加进项目进行使用（mysql、oracle，sql server 都有自己的一套类库，可在各自的官网下载）
* jdbc 编程六步【掌握】
* 类加载方式注册驱动
* 属性文件中读取配置信息 Driver、url、username、password
* PowerDesigher 设计表以及导出表
* 了解并解决 SQL注入现象
* Statement 和 PreparedStatement 实现数据库数据增删改查【核心】
* jdbc 中事务控制
* 了解悲观锁/行级锁和乐观锁（了解行级锁的使用）
* jdbc 工具类封装（获取连接和释放资源）
---

### CSS
换行：（单目符）
`<br>`

保留格式：
```
<pre>
	xxx
</pre>
```

实体符号：
```
&lt; 小于号
&gt; 大于号
&nbsp; 空格
```

重点：
* 换行
* 横线
* 实体符
* 表格（核心）
* 图片（背景颜色，背景图片）
* 超链接（核心）
* 有序、无序列表
* 表单（核心）
* 下拉列表
* file控件
* 隐藏域hidden控件
* readonly和disabled
* 控制可输入的字符数maxlength

html中引入css样式的三种方式：
1. 内联定义
2. 样式块
3. 引入css文件

https://www.bilibili.com/video/BV1ov411M7hP/?spm_id_from=autoNext

* 汉堡菜单：https://codepen.io/erikterwan/pen/EVzeRP
* css弹出效果：https://codepen.io/imprakash/pen/GgNMXO
* css下拉选择：https://codepen.io/imprakash/pen/VejpQP
* 下拉式菜单：https://codepen.io/andornagy/pen/xhiJH
* CSS图片轮播图：https://codepen.io/AMKohn/pen/EKJHf
* 侧边栏菜单：https://codepen.io/plavookac/pen/qomrMw
* 悬停按钮：https://codepen.io/kathykato/pen/rZRaNe
* 按钮悬停效果：https://codepen.io/sfoxy/pen/XpOoJe
* CSS开关按钮：https://codepen.io/himalayasingh/pen/EdVzNL
* CSS输入文本动画：https://codepen.io/alewinski/pen/grqgqx
* CSS动画菜单：https://codepen.io/joellesenne/pen/qtLEG
* CSS提示：https://codepen.io/cristina-silva/pen/XXOpga
* CSS表格：https://codepen.io/alexerlandsson/pen/mPWgpO
* CSS分段控件：https://codepen.io/fstgerm/pen/Jafyj
* 纯CSS响应式选项卡：https://codepen.io/Fallupko/pen/ruLdg
* CSS下列菜单：https://codepen.io/Moslim/pen/gmzvQj
* 响应式CSS标签：https://codepen.io/imprakash/pen/epZvbQ
---

### JavaScript(js)
* html中嵌入js代码的三种方式
* js函数定义的两种方式
* js中的6种数据类型以及typeof运算符6种结果
* js中常用事件以及两种事件注册方式
* 回车键捕捉以及void运算符唯一用法
* 控制语句
* 获取和设置各标签属性
* innerText和innerHtml
* 正则以及trim函数
* prototype动态添加方法和属性
* 表单验证
* 周期函数setInterval、clearInterval
* BOM编程之open、close、confirm、location、history
* 顶级窗口的设置
* js中json在开发中的使用