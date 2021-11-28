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

#### 知识点小记
* 全局变量(属性)可以不赋值，直接使用，因为有默认值
* 局部变量必须赋值后，才能使用，因为没有默认值
* 局部变量只能在本类中对应的方法中使用