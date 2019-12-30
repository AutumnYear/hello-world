# 前言

fork可以理解为对某个仓库的拷贝.fork工作流可以让我们在不影响主项目的前提下,自由改动代码.

fork常用的使用场景有两种
## 1. 向别人的项目提建议

## 2.从别人项目作为自己项目启动开端,延伸开发

# 什么是fork工作流呢?
要理解fork,需要明白三个分支的概念:本地分支(local branch),远程分支(一般为origin branch),公共分支(upstream branch).

我们在进行日常代码pull和push的时候,是对origin的修改和同步,如果开发完成后,想将自己的改动同步到公共分支,需要创建pull request

![fork工作流](https://github.com/AutumnYear/hello-world/blob/master/src/main/resources/tools/git/fork.jpg)

如果其余贡献者已经对项目进行了修改,如果想在这个基础上做新的修改,需要同步fork,就是从公共仓库获取最新代码

![同步fork](https://github.com/AutumnYear/hello-world/blob/master/src/main/resources/tools/git/syncFork.png)

操作

开始你的fork:

在项目顶部,点击fork按钮,现在你就拥有一份仓库的fork啦!

点击clone按钮,就可以获取git 在fork之后的URL了.

# 开发流程
## 1.配置git
## 2.为fork创建一份本地的拷贝
复制项目的URL,在终端进入你理想的文件夹下,执行

git clone ssh:``//git@git.sankuai.com/UserName/projectName

## 3.验证

通过git remote -v 查看远程分支,默认的远端仓库是origin.如下
```
origin https://github.com/user/repo.git (fetch)

origin https://github.com/user/repo.git (push)
```
如果想要随时更新公共分支,可以加入远端公共分支的仓库

git remote add upstream <url>

再次查看 git remote -v
```
$ git remote -v

origin https://github.com/user/repo.git (fetch)

origin https://github.com/user/repo.git (push)

upstream https://github.com/otheruser/repo.git (fetch)

upstream https://github.com/otheruser/repo.git (push)

```
提示:如果本地新增了branch,在git push之后,之后push到origin仓库,upstream仓库是没有的,所以需要,来设置upstream仓库,然后通过git push upstream --tags,更新公共仓库的tag

## 4.同步远端分支
想要保持本地分支和远端公共分支同步,可以通过以下命令
```
git fetch upstream    ``//从远端分支获取更新`

git checkout master 

git merge upstream/master   ``//merge更新
```
### 5.提交
提交代码流程是一样,只是加了一个创建pull request的操作

git commit — git pull — git push — 打开git的网页,创建pull request,请队友code review