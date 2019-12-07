## Spring boot
### first day init  

### 资料
[Bootstrap文档](https://v3.bootcss.com/css/) 

[Springboot 文档](https://spring.io/guides)

[github Oauth 文档](https://developer.github.com/apps/)

[spring 官方文档]()

### 数据库脚本
```sql
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` varchar(100) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `token` char(36) DEFAULT NULL,
  `gmt_create` bigint(20) DEFAULT NULL,
  `gmt_modified` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
```