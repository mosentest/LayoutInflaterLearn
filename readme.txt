git命令教程
https://www.cnblogs.com/jeremylee/p/5715289.html
http://www.runoob.com/git/git-remote-repo.html

本demo主要是巩固下layoutinflater的原理







C:\Users\RGB_565>git
usage: git [--version] [--help] [-C <path>] [-c name=value]
           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
           [-p | --paginate | --no-pager] [--no-replace-objects] [--bare]
           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
           <command> [<args>]

These are common Git commands used in various situations:

start a working area (see also: git help tutorial)
   clone      Clone a repository into a new directory
   init       Create an empty Git repository or reinitialize an existing one

work on the current change (see also: git help everyday)
   add        Add file contents to the index
   mv         Move or rename a file, a directory, or a symlink
   reset      Reset current HEAD to the specified state
   rm         Remove files from the working tree and from the index

examine the history and state (see also: git help revisions)
   bisect     Use binary search to find the commit that introduced a bug
   grep       Print lines matching a pattern
   log        Show commit logs
   show       Show various types of objects
   status     Show the working tree status

grow, mark and tweak your common history
   branch     List, create, or delete branches
   checkout   Switch branches or restore working tree files
   commit     Record changes to the repository
   diff       Show changes between commits, commit and working tree, etc
   merge      Join two or more development histories together
   rebase     Reapply commits on top of another base tip
   tag        Create, list, delete or verify a tag object signed with GPG

collaborate (see also: git help workflows)
   fetch      Download objects and refs from another repository
   pull       Fetch from and integrate with another repository or a local branch
   push       Update remote refs along with associated objects

'git help -a' and 'git help -g' list available subcommands and some
concept guides. See 'git help <command>' or 'git help <concept>'
to read about a specific subcommand or concept.

C:\Users\RGB_565>cd E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn

C:\Users\RGB_565>e:

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git init
Initialized empty Git repository in E:/moziqi_dev_wrok/ecl_chubao_work/LayoutInflaterLearn/.git/

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git remote add  LayoutInflaterLearn https://github.com/moziqi/LayoutInflaterLearn.git

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git remote add  origin https://github.com/moziqi/LayoutInflaterLearn.git

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git push -u origin master
error: src refspec master does not match any.
error: failed to push some refs to 'https://github.com/moziqi/LayoutInflaterLearn.git'

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>ssh -keygen -t rsa -C "709847739@qq.com"
'ssh' 不是内部或外部命令，也不是可运行的程序
或批处理文件。

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>ssh-keygen -t rsa -C "709847739@qq.com"
'ssh-keygen' 不是内部或外部命令，也不是可运行的程序
或批处理文件。

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>ssh -keygen -t rsa -C "709847739@qq.com"
'ssh' 不是内部或外部命令，也不是可运行的程序
或批处理文件。

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git remote add  origin https://github.com/moziqi/LayoutInflaterLearn.git
fatal: remote origin already exists.

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git push -u origin master
error: src refspec master does not match any.
error: failed to push some refs to 'https://github.com/moziqi/LayoutInflaterLearn.git'

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git push -u origin master
error: src refspec master does not match any.
error: failed to push some refs to 'https://github.com/moziqi/LayoutInflaterLearn.git'

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git add readme.md
fatal: pathspec 'readme.md' did not match any files

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git add
Nothing specified, nothing added.
Maybe you wanted to say 'git add .'?

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git add  .
warning: LF will be replaced by CRLF in DemoMain/AndroidManifest.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoMain/bin/AndroidManifest.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoMain/gen/com/android/demomain/BuildConfig.java.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoMain/proguard-project.txt.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoMain/project.properties.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoMain/res/values-v11/styles.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoMain/res/values-v14/styles.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoMain/res/values-w820dp/dimens.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoMain/res/values/strings.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoMain/res/values/styles.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoPlugin/AndroidManifest.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoPlugin/bin/AndroidManifest.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoPlugin/gen/com/moziqi/demoplugin/BuildConfig.java.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoPlugin/proguard-project.txt.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoPlugin/project.properties.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoPlugin/res/values-v11/styles.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoPlugin/res/values-v14/styles.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoPlugin/res/values-w820dp/dimens.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoPlugin/res/values/strings.xml.
The file will have its original line endings in your working directory.
warning: LF will be replaced by CRLF in DemoPlugin/res/values/styles.xml.
The file will have its original line endings in your working directory.

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn> git commit -m "init files"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'RGB_565@moziqi.(none)')

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git config --global user.email "790847739@qq.com"

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git config --global user.name "moziqi"

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn> git commit -m "init files"
[master (root-commit) ab017e6] init files
 103 files changed, 1117 insertions(+)
 create mode 100644 DemoMain/.classpath
 create mode 100644 DemoMain/.project
 create mode 100644 DemoMain/.settings/org.eclipse.jdt.core.prefs
 create mode 100644 DemoMain/AndroidManifest.xml
 create mode 100644 DemoMain/assets/DemoPlugin.apk
 create mode 100644 DemoMain/bin/AndroidManifest.xml
 create mode 100644 DemoMain/bin/DemoMain.apk
 create mode 100644 DemoMain/bin/classes.dex
 create mode 100644 DemoMain/bin/classes/com/android/demomain/AssetUtils.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/BuildConfig.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/ClassloaderUtils.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/IActivty.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/MainActivity.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/PluginActivity.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/R$attr.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/R$dimen.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/R$drawable.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/R$id.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/R$layout.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/R$menu.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/R$string.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/R$style.class
 create mode 100644 DemoMain/bin/classes/com/android/demomain/R.class
 create mode 100644 DemoMain/bin/res/crunch/drawable-hdpi/ic_launcher.png
 create mode 100644 DemoMain/bin/res/crunch/drawable-mdpi/ic_launcher.png
 create mode 100644 DemoMain/bin/res/crunch/drawable-xhdpi/ic_launcher.png
 create mode 100644 DemoMain/bin/res/crunch/drawable-xxhdpi/ic_launcher.png
 create mode 100644 DemoMain/bin/resources.ap_
 create mode 100644 DemoMain/gen/com/android/demomain/BuildConfig.java
 create mode 100644 DemoMain/gen/com/android/demomain/R.java
 create mode 100644 DemoMain/ic_launcher-web.png
 create mode 100644 DemoMain/proguard-project.txt
 create mode 100644 DemoMain/project.properties
 create mode 100644 DemoMain/res/drawable-hdpi/ic_launcher.png
 create mode 100644 DemoMain/res/drawable-mdpi/ic_launcher.png
 create mode 100644 DemoMain/res/drawable-xhdpi/ic_launcher.png
 create mode 100644 DemoMain/res/drawable-xxhdpi/ic_launcher.png
 create mode 100644 DemoMain/res/layout/activity_main.xml
 create mode 100644 DemoMain/res/menu/main.xml
 create mode 100644 DemoMain/res/values-v11/styles.xml
 create mode 100644 DemoMain/res/values-v14/styles.xml
 create mode 100644 DemoMain/res/values-w820dp/dimens.xml
 create mode 100644 DemoMain/res/values/dimens.xml
 create mode 100644 DemoMain/res/values/strings.xml
 create mode 100644 DemoMain/res/values/styles.xml
 create mode 100644 DemoMain/src/com/android/demomain/AssetUtils.java
 create mode 100644 DemoMain/src/com/android/demomain/ClassloaderUtils.java
 create mode 100644 DemoMain/src/com/android/demomain/IActivty.java
 create mode 100644 DemoMain/src/com/android/demomain/MainActivity.java
 create mode 100644 DemoMain/src/com/android/demomain/PluginActivity.java
 create mode 100644 DemoPlugin/.classpath
 create mode 100644 DemoPlugin/.project
 create mode 100644 DemoPlugin/.settings/org.eclipse.jdt.core.prefs
 create mode 100644 DemoPlugin/AndroidManifest.xml
 create mode 100644 DemoPlugin/bin/AndroidManifest.xml
 create mode 100644 DemoPlugin/bin/DemoPlugin.apk
 create mode 100644 DemoPlugin/bin/R.txt
 create mode 100644 DemoPlugin/bin/classes.dex
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/BuildConfig.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/BundlerResourceLoader.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/DemoView.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/InflaterFactory.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/MainActivity.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/PluginIAct$1.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/PluginIAct.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/R$attr.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/R$dimen.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/R$drawable.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/R$id.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/R$layout.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/R$menu.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/R$string.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/R$style.class
 create mode 100644 DemoPlugin/bin/classes/com/moziqi/demoplugin/R.class
 create mode 100644 DemoPlugin/bin/dexedLibs/demomain-0d33cc586e46309b3e803a092420cdc7.jar
 create mode 100644 DemoPlugin/bin/res/crunch/drawable-hdpi/ic_launcher.png
 create mode 100644 DemoPlugin/bin/res/crunch/drawable-mdpi/ic_launcher.png
 create mode 100644 DemoPlugin/bin/res/crunch/drawable-xhdpi/ic_launcher.png
 create mode 100644 DemoPlugin/bin/res/crunch/drawable-xxhdpi/ic_launcher.png
 create mode 100644 DemoPlugin/bin/resources.ap_
 create mode 100644 DemoPlugin/gen/com/moziqi/demoplugin/BuildConfig.java
 create mode 100644 DemoPlugin/gen/com/moziqi/demoplugin/R.java
 create mode 100644 DemoPlugin/ic_launcher-web.png
 create mode 100644 DemoPlugin/lib/demomain.jar
 create mode 100644 DemoPlugin/proguard-project.txt
 create mode 100644 DemoPlugin/project.properties
 create mode 100644 DemoPlugin/res/drawable-hdpi/ic_launcher.png
 create mode 100644 DemoPlugin/res/drawable-mdpi/ic_launcher.png
 create mode 100644 DemoPlugin/res/drawable-xhdpi/ic_launcher.png
 create mode 100644 DemoPlugin/res/drawable-xxhdpi/ic_launcher.png
 create mode 100644 DemoPlugin/res/layout/activity_main.xml
 create mode 100644 DemoPlugin/res/menu/main.xml
 create mode 100644 DemoPlugin/res/values-v11/styles.xml
 create mode 100644 DemoPlugin/res/values-v14/styles.xml
 create mode 100644 DemoPlugin/res/values-w820dp/dimens.xml
 create mode 100644 DemoPlugin/res/values/dimens.xml
 create mode 100644 DemoPlugin/res/values/strings.xml
 create mode 100644 DemoPlugin/res/values/styles.xml
 create mode 100644 DemoPlugin/src/com/moziqi/demoplugin/BundlerResourceLoader.java
 create mode 100644 DemoPlugin/src/com/moziqi/demoplugin/DemoView.java
 create mode 100644 DemoPlugin/src/com/moziqi/demoplugin/InflaterFactory.java
 create mode 100644 DemoPlugin/src/com/moziqi/demoplugin/MainActivity.java
 create mode 100644 DemoPlugin/src/com/moziqi/demoplugin/PluginIAct.java

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git push -u origin master
Counting objects: 141, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (105/105), done.
Writing objects: 100% (141/141), 273.56 KiB | 9.43 MiB/s, done.
Total 141 (delta 30), reused 0 (delta 0)
remote: Resolving deltas: 100% (30/30), done.
To https://github.com/moziqi/LayoutInflaterLearn.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git add readme.txt

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git push -u origin master
Everything up-to-date
Branch 'master' set up to track remote branch 'master' from 'origin'.

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git commint -m "增加readme介绍"
git: 'commint' is not a git command. See 'git --help'.

The most similar command is
        commit

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git commimt -m "增加readme介绍"
git: 'commimt' is not a git command. See 'git --help'.

The most similar command is
        commit

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git comimt -m "增加readme介绍"
git: 'comimt' is not a git command. See 'git --help'.

The most similar command is
        commit

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git commit -m "增加readme介绍"
[master 953b17f] 增加readme介绍
 1 file changed, 5 insertions(+)
 create mode 100644 readme.txt

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>git push -u origin master
Counting objects: 3, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 447 bytes | 447.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/moziqi/LayoutInflaterLearn.git
   ab017e6..953b17f  master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.

E:\moziqi_dev_wrok\ecl_chubao_work\LayoutInflaterLearn>
