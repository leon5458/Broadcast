# Broadcast

### 主要写了 动态注册,静态注册,本地广播
静态注册：通过<receiver></receiver>的形式在AndroidManifest.xml中注册的广播,activity退出时广播依然在进行

动态注册：通过context. registerReceiver在程序中显示注册的广播,activity 退出时广播结束

