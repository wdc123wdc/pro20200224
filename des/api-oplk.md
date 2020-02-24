## 0.1图片上传
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| administrator_id  | int  | 主键 自增 | Id  |
| username | varchar(20)  | 非空，唯一索引 | 用户名  |
| realName  | varchar(20)  | 索引 | 真实姓名  |
| email  | varchar(100)  | 索引 | 邮箱  |
| encrypted_password  | varchar(100)  | 非空 | 加密密码  |
| status  | tinyint  | 非空，默认启用  | 状态（0禁用，1启用）  |
| create_time  | datetime  |  非空 | 创建时间  |
| avatar_url  | varchar(100)  |   | 头像地址 |


## 1.1管理员登录
URL: /administrator/login?jusernam={username}&passsword={pasworrd} 
Method：GET  

ResponseBody:  
```
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c

```

Request Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| username   | String   | 用户名    |
| password   | String   | 密码    |

Response Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
|    | string   | jwt token    |


## 1.2管理员获取profile
URL: /administrator/gerprofile
Method：GET  

ResponseHeader:  
jcartToken:eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c

ResponseBody:  
```json

{
    "administratorId":1234,
    "username":"user001",
    "realName":"cjf",
    "email":"cjf@qq.com",
    "avatarUrl":"xxx1.jpg",
    "status":1,
    "createTimestamp":1582514828383,
}

```

Request Header

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| jcartToken   | String   | jwt token    |

Response Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| administratorId   | Integer   | 管理员id    |
| username   | string   |   用户名   |
| realName  | string   |   姓名   |
| email   | string   |   邮箱   |
| avatarUrl   | string   |  头像    |
| status   | Byte   |   状态   |
| createTimestamp  | Long   |  创建时间    |


## 管理员更新profile
URL: /administrator/updateProfile   
Method：POST  

ResponseHeader:  
jcartToken:eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c

RequestBody:  
```json
{
    "username":"user001",
    "realName":"cjf",
    "email":"cjf@qq.com",
    "avatarUrl":"xxx1.jpg",
    "status":1,
}

```


Request Header  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| company   | String   | 公司名    |
| address   | String   | 公司地址    |
| time   | Long   | 面试时间戳    |

Response Field  

| 字段     |     类型 |   描述   | 
| :--------------: | :--------:| :------: |
| username   | String   | 密码    |
| realName   | String   | 姓名    |
| email   | String   | 邮箱    |
| avatarUrl   | String   | 头像    |
| status   | Byte   | 状态    |



# 管理员获取密码重置密码
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| product_id  | int  | 主键 自增 | 图片Id  |
| description | varchar(20)  | 非空 | 描述  |
| pther_pic_urls  | varchar(20)  | 非空 | 其他图片  |


# 管理员重置密码
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| order_id  | int  | 主键 自增 | 订单Id  |
| customer_id | int  | 非空，唯一索引 | 客户id  |
| total_price  | int  | 非空 | 总金额  |
| create_time  | varchar(20)  | 非空 | 创建时间  |
| update_tiem  | varchar(20) | 非空 | 修改时间  |
| ship_method  | varchar(20) | 非空  | 寄送方式  |
| pay_method | varchar(20)  | 非空 | 支付方式  |
| reword_points  | int | 非空 | 积分  |
| status  | tinyint | 非空  | 订单状态(0待处理、1处理中、2待发货、3已发货、4代签收、5已签收、6待支付、7已支付、8取消、9拒签、10完成)  | 


# 管理员搜索列表
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| order_histiry_id  | int  | 主键 自增 | 历史订单Id  |
| order_id | int  | 非空，唯一索引 | 订单id  |
| time  | varchar(20)   | 非空 | 时间  |
| comment  | varchar(20)  | 非空 | 备注  |
| order_status  | tinyint | 非空 | 状态  |
| customer_notified  | tinyint | 非空 | 通知用户(1已通知、2未通知)  |


# 管理员回显
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| order_id  | int  | 主键 自增 | 历史订单Id  |
| ship_adddress | int  | 非空 | 寄送地址  |
| invoice_address  | varchar(20)   | 非空 | 发票地址  |
| ship_price  | int | 非空 | 邮费  |


# 管理员创建
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| product_id  | int  | 主键 自增 | 商品Id  |
| product_code | int  | 非空 | 代号  |
| product_name  | varchar(20)   | 非空 | 名称  |
| unit_price  | int | 非空 | 单价  |
| quantity  | int | 非空 | 数量  |



# 管理员更新
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| return_id  | int  | 主键 自增 | 退单Id  |
| order_id  | int  | 非空，唯一索引 | 订单Id  |
| order_time | varchar(20)  | 非空 | 订单时间  |
| customer_name  | varchar(20)  | 非空 | 客户名称  |
| email  | varchar(20)  | 非空 | 邮箱  |
| mobile  | varchar(20) | 非空 | 手机  |
| product_code  | varchar(20) | 非空  | 商品摘要  |
| product_name | varchar(20)  | 非空 | 商品名称  |
| quantity  | int | 非空 | 数量  |
| reason  | varchar(20)  | 非空  | 理由  | 
| opened  | varchar(20)  | 非空  | 开封  | 
| comment  | varchar(20)  | 非空  | 备注  | 
| action  | varchar(20)  | 非空  | 处理方式  | 


# ReturnHistory
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| Return_history_id  | int  | 主键 自增 | 退单历史Id  |
| return_id  | int  | 非空，唯一索引 | 退货Id  |
| time | varchar(20)  | 非空 | 时间  |
| return_status  | varchar(20)  | 非空 | 退货状态  |
| customer_notified  | varchar(20)  | 非空 | 通知客户  |