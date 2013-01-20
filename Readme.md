# play2-jquery

A Play2 module to provide the jQuery assets.

Note that module runs against Play 2.1-RC1.

## What exactly does this module do?

* Provides `*.js` and `*.min.js` files within the `public\javascripts` sub-directory of the classpath.

Assuming you maintain the default `GET  /assets/*file controllers.Assets.at(path="/public", file)` route from the skeleton, this means that the jQuery javascript files will be available at `/assets/*`.

## How do I use it?

Add the following to the appDependencies section of your Build.sbt file:

`"com.aidanns" %% "play2-jquery" % "1.9.0"`

Add the following to the main section of your Build.sbt file:

`resolvers += Resolver.url("com.aidanns Github Repo", url("https://raw.github.com/aidanns/play2-modules/master/releases"))(Resolver.ivyStylePatterns)`

## What does the repo contain?

* `module` directory contains the Play! submodule.
* `samples` directory contains a (very sparse) example of using the submodule.

## Updating the jQuery version

This requires a working Python installation.

1. `cd module\lib\jquery`
2. `git pull`
3. Build jQuery as per their instructions.
4. `cd ../../`
5. `script/update.py`
6. `git add .`
7. `git commit -m "Updated to jQuery version x.x.x"`
8. Submit a pull request on Github.
