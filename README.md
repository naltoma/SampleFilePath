# File I/O時のパス設定例
## これは何？
(1) package指定、(2) IntelliJ上からの実行、(3) ターミナル上での実行ができるようなファイル読み込み実装例。

## 動かし方
- ターミナル上での実行方法1（jarファイル生成して実行）
```
git clone https://github.com/naltoma/SampleFilePath.git
cd SampleFilePath
gradle jar
java -jar build/libs/SampleFilePath-1.0-SNAPSHOT.jar
```
- ターミナル上での実行方法2（自分でコンパイルしてExecクラス実行）
```
git clone https://github.com/naltoma/SampleFilePath.git
cd SampleFilePath
javac -d . **/*.java
java jp.ac.uryukyu.ie.tnal.Exec
```
- IntelliJ上での実行方法1（Gradle経由）
    - Viewメニュー -> Tool Windows -> Gradle
    - Gradle Projectsパネル -> Tasks -> build -> jar
    - Projectパネル -> build/libs/build/libs/SampleFilePath-1.0-SNAPSHOT.jar を実行
- IntelliJ上での実行方法2（Runメニュー経由（jarファイルではなくクラスファイルの実行））
    - Runメニュー -> RunからExecを選択して実行
