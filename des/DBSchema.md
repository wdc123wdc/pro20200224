# Administrator
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


# Customer
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| customer_id  | int  | 主键 自增 | Id  |
| username | varchar(20)  | 非空，唯一索引 | 用户名  |
| real_name  | varchar(20)  | 索引 | 真实姓名  |
| email  | varchar(100)  | 索引 | 邮箱  |
| email_verified  | varchar(100)  | 非空  | 邮箱验证码 |
| encrypted_password  | varchar(100)  | 非空 | 加密密码  |
| news_subscribed  | tinyint  | 非空，默认启用  | 状态（0禁用，1启用）  |
| default_address_Id  | varchar(100)  |  非空 | 默认地址  |
| mobile  | varchar(100)  | 非空  | 手机号码 |
| mobile_verified  | varchar(100)  | 非空  | 手机验证码 |


# Administrator
# Address
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| address_id  | int  | 主键 自增 | 地址Id  |
| customer_id | int  | 非空，唯一索引 | 客户id  |
| receiver_names  | varchar(20)  | 索引 | 收货人姓名  |
| receiver_mobile  | varchar(20)  | 索引 | 收货人手机号  |
| content  | varchar(100)  | 非空 | 地址内容  |


# Administrator
# Product
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| productId  | int  | 主键 自增 | 商品Id  |
| product_name | varchar(20)  | 非空，唯一索引 | 商品名称  |
| product_code  | varchar(20)  | 非空，索引 | 商品代号  |
| product_abstract  | varchar(20)  | 非空，索引 | 摘要  |
| price  | int | 非空 | 价格  |
| discount  | varchar(20) |  | 打折  |
| sort_order | varchar(20)  | 非空 | 排序  |
| stock_quantity  | int  | 非空 | 库存量  |
| status  | varchar(20)  | 非空 | 状态  |
| rewordPoints  | int | 非空 | 积分  |
| main_pic_url  | varchar(100) |  | 主图  |


# Administrator
# ProductDetail
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| product_id  | int  | 主键 自增 | 图片Id  |
| description | varchar(20)  | 非空 | 描述  |
| pther_pic_urls  | varchar(20)  | 非空 | 其他图片  |


# Order
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


# OrderHistory
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| order_histiry_id  | int  | 主键 自增 | 历史订单Id  |
| order_id | int  | 非空，唯一索引 | 订单id  |
| time  | varchar(20)   | 非空 | 时间  |
| comment  | varchar(20)  | 非空 | 备注  |
| order_status  | tinyint | 非空 | 状态  |
| customer_notified  | tinyint | 非空 | 通知用户(1已通知、2未通知)  |


# OrderDetail
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| order_id  | int  | 主键 自增 | 历史订单Id  |
| ship_adddress | int  | 非空 | 寄送地址  |
| invoice_address  | varchar(20)   | 非空 | 发票地址  |
| ship_price  | int | 非空 | 邮费  |


# Order_product
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| product_id  | int  | 主键 自增 | 商品Id  |
| product_code | int  | 非空 | 代号  |
| product_name  | varchar(20)   | 非空 | 名称  |
| unit_price  | int | 非空 | 单价  |
| quantity  | int | 非空 | 数量  |



# Return
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