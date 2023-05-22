# DDL：

**5.26（下周五，一周时间）**

- Yu：
  
  - ~~数据库用户信息建表、数据库与后端连通、明确如何与NodeJS进行数据交互，基本的前端页面搭建（至少做完登陆注册）~~
  
  - **明确如何与NodeJS进行数据交互（socketio）**，选择界面人物模型展示和地图展示，确定后台页面需要展示的数据类型和展示形式

- Guo：
  
  - ~~第一/第三人称视角切换；WASD控制移动，走路、静步、跑步切换？~~
  
  - 修改AD控制人物左右平移，摄像机视角改变（鼠标控制，上下左右），人物模型添加hitbox和射击命中判定，人物生命值等属性的添加，人物模型射击动画，socketio相关

- Peng：
  
  - ~~基本场地搭建，引导线~~
  
  - 基本代码框架搭建，确定地图和路线，根据CQB放置靶子，完善引导线与人物互动的机制

- Luo：
  
  - ~~鼠标控制瞄准和开火，击中判定和反馈~~
  
  - 添加枪口火焰，实现连射，用Threefps的模型和动画实现换弹动画，射击属性添加（socketio相关，伤害，子弹UI，射速）

- Web3D：代码框架搭建，模块化（画类图）

- Lab3 PJ优化部分分工：目前只有一个部署任务，其余任务待定

****

## 问题：

* ...

## TODO：

* 单人CQB场景完成
* 
* 多人对战改成多人打AI NPC？

****

## 教学材料：

### Ref：

- [pyb找到的开源项目](https://github.com/mohsenheydari/three-fps), 包含了AI寻路库three-pathfinding，物理库ammo.js

- [yxy找到的射击游戏教程](%5Bhttps://www.bilibili.com/video/BV1mU4y1P7fL/?buvid=XY390E439608D0E5292492FBC2208101249F9&is_story_h5=false&mid=4s1Jyyd4gJS3T0MvBrcvlw%3D%3D&p=44&plat_id=116&share_from=ugc&share_medium=android&share_plat=android&share_session_id=940bd086-4b8c-48a2-9735-78ec8b104bbe&share_source=WEIXIN&share_tag=s_i%C3%97tamp=1681798963&unique_k=0ppylQy&up_id=1851256541&vd_source=3f2be0127608c5e67fbecd67fdd958e7%5D(https://www.bilibili.com/video/BV1mU4y1P7fL/?buvid=XY390E439608D0E5292492FBC2208101249F9&is_story_h5=false&mid=4s1Jyyd4gJS3T0MvBrcvlw%3D%3D&p=44&plat_id=116&share_from=ugc&share_medium=android&share_plat=android&share_session_id=940bd086-4b8c-48a2-9735-78ec8b104bbe&share_source=WEIXIN&share_tag=s_i&timestamp=1681798963&unique_k=0ppylQy&up_id=1851256541&vd_source=3f2be0127608c5e67fbecd67fdd958e7))

- [可以体现我们项目教学性的一个例子](%5BVR%E5%B0%84%E5%87%BB%E7%B3%BB%E7%BB%9F%E7%94%A8%E4%BA%8E%E5%86%9B%E8%AE%AD_%E4%B8%AD%E5%9B%BD%E7%BD%91%5D(http://digital.china.com.cn/2018-09/06/content_40492938.htm))

### Lab2的B站教程：

* P1-16: 入门级NodeJS APP介绍，Socket.io介绍，获取免费Web3D模型资源以及动画的网站介绍。

* P17: 添加纹理

* P18: 添加动画，动画切换

* P19: 移动控制，移动状态判定和动画切换

* P20: 碰撞检测（前后左右，上下）

* P21: Socket.io同步通信——服务器端

* P22: 服务器和客户端同步通信的逻辑

* P23: Socket.io同步通信——客户端代码分析

* P24: Socket.io处理远程玩家的信息——客户端代码分析

* P25: 对话泡泡实现

* P26: 鼠标点选远程用户实现

* P27: Socket.io实现聊天信息传递

### Lab2的基础学习文档：

* Three.js各组件介绍

* 简单的Web3D场景构建教学

* 基础Socket.io介绍

****

## PJ构想：

* 场景1: 枪械训练——CQB战术教程，体现出“教学性”
  
  * 参考视频：[CQB案例分析](https://www.bilibili.com/video/BV1UY4y1i7HM/?spm_id_from=333.788.recommend_more_video.1&vd_source=3f2be0127608c5e67fbecd67fdd958e7)，[CQB教程（上）](https://www.bilibili.com/video/BV1yL411D7XD/?spm_id_from=333.788.recommend_more_video.6&vd_source=3f2be0127608c5e67fbecd67fdd958e7)，[CQB教程（下）](https://www.bilibili.com/video/BV1JN411A7bm/?spm_id_from=333.788.recommend_more_video.-1&vd_source=3f2be0127608c5e67fbecd67fdd958e7)，[RON CQB教学](https://www.bilibili.com/video/BV1U24y1S79L/?spm_id_from=333.788.recommend_more_video.11&vd_source=3f2be0127608c5e67fbecd67fdd958e7)
    
    > 能否在Web3D场景中加入视频？或者用别的方式引入必要的教学资料（如文字）？用Web3D还原视频动画？
  
  * 支持多人联机？

* 场景2: 多人在线PVP——引入AI NPC
  
  * 体现多人联机功能
  * 支持文字交流

## 页面：

* 前台页面——2个
  
  * 登陆/注册
  
  * 角色和场景选择

* 后台页面——1个
  
  * **做成图表化展示有加分**

* 两个场景的页面——2个

## 需要实现的功能：

### Three.js:

* 人物：（在lab2基础教程文档中都有）
  
  * 第一/第三人称视角切换
  
  * WASD控制移动，走路、静步、跑步切换？
  
  * 碰撞检测（属于人物+场景？）

* 枪械：
  
  * 鼠标控制瞄准和开火
  
  * 击中判定和反馈
  
  * *引入复杂的瞄准系统？*
  
  * *多武器系统？*

* 场景：（在lab2基础教程文档中部分有）
  
  * 基本场地搭建
  
  * 引导线交互
  
  * AI敌人引入，多人射击场景？

> 外部模型获得、动画获得和导入可以参考B站教程
> 
> 场地建模是否非平整？这涉及到碰撞检测引入重力和地板相关的检测。

### Socket.io:

* 人物：
  
  * 行为同步
  
  * 聊天功能

* 射击：
  
  * 攻击结果同步（打靶结果，PVP命中先后顺序等）
  
  * 死亡，复活等设置

> Tips：
> 
> * 一个client只创建一个socket
> 
> * 服务器和客户端有对应的emit/on方法
> 
> * cheat sheet： https://socket.io/docs/v4/emit-cheatsheet/
> 
> * app.js与需要回传给浏览器的文件分开存放，不要放在同一个文件夹中

### Angular + SpringBoot:

* 账号注册和登陆

* 房间选择、人物选择

* 后台数据可视化展示

* Angular+SpringBoot获得的信息与NodeJS交互（如登陆后，以登陆用户账号传入socket）
