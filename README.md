# imklib tutorial (DEPRECATED)

**Deprecation notice**: This project was exploratory work. For current development, see [saalfeldlab/imklib2](https://github.com/saalfeldlab/imklib2).

[imklib](https://github.com/hanslovsky/imklib-tutorial/tree/solution) is an experimental library to explore the use of Kotlin extension functions and operator overloading for a NumPy like user experience for the [ImgLib2](https://github.com/imglib/imglib2) Java multi-dimensional image processing library. The library itself is highly experimental and undocumented but demonstrates that tensor-wise operations are possible in ImgLib2/the JVM world with Kotlin. With imklib, you can simply write code like this:

``` kotlin
// element-wise addition of images
val img1 = ...
val img2 = ...
val img3 = img1 + img2

// element-wise exponentiation of an image
val img4 = img3.exp()

// direct voxel access (inefficient but very convenient when access is only sparse):
val voxel = img4[1, 3]

// sub-sample every second along first axis
val subSampled = img1[AX..2]

// slicing
val slice = img2[AX, 0]

// rotations
val rotated = img3.rotate(angle=30)
```


## Further Reading and Material

imklib builds upon [operator overloading](https://kotlinlang.org/docs/reference/operator-overloading.html) and [extension functions](https://kotlinlang.org/docs/reference/extensions.html#extension-functions) of the [Kotlin](https://kotlinlang.org) programming language. A good place to get familiar with Kotlin are the [*Koans*](https://kotlinlang.org/docs/tutorials/koans.html), a set of tutorials and exercises that you can interactively complete in the web-browser. Completing the Koans is an excellent entry point into Kotlin but for this tutorial it will suffice to focus on operator overloading and extension functions.

The [imklib-tutorial](https://github.com/hanslovsky/imklib-tutorial) provides a [BeakerX](http://beakerx.com) [notebook with introductory examples for the use of imklib](https://github.com/hanslovsky/imklib-tutorial/blob/master/notebooks/00_imklib-basics.ipynb) and a [hands-on exercise notebook](https://github.com/hanslovsky/imklib-tutorial/blob/master/notebooks/exercises/gradient.ipynb). I recommend installation of BeakerX through conda:

```sh
conda create -n learnathon -c conda-forge python=3.7 ipywidgets beakerx
conda activate learnathon
```
If you encounter errors like this during installation
```
Traceback (most recent call last):
File "/Users/turek/anaconda3/envs/learnathon/bin/beakerx", line 11, in <module>
sys.exit(run())
File "/Users/turek/anaconda3/envs/learnathon/lib/python3.7/site-packages/beakerx/init.py", line 44, in run
parse()
File "/Users/turek/anaconda3/envs/learnathon/lib/python3.7/site-packages/beakerx/commands.py", line 91, in parse
args.func(args)
File "/Users/turek/anaconda3/envs/learnathon/lib/python3.7/site-packages/beakerx/install.py", line 227, in install
_install_beakerx(args)
File "/Users/turek/anaconda3/envs/learnathon/lib/python3.7/site-packages/beakerx/install.py", line 220, in _install_beakerx
_copy_icons()
File "/Users/turek/anaconda3/envs/learnathon/lib/python3.7/site-packages/beakerx/install.py", line 91, in _copy_icons
shutil.copyfile(os.path.join(src_base, 'logo-32x32.png'), os.path.join(dst_base, 'logo-32x32.png'))
File "/Users/turek/anaconda3/envs/learnathon/lib/python3.7/posixpath.py", line 80, in join
a = os.fspath(a)
TypeError: expected str, bytes or os.PathLike object, not NoneType
```
try creating an empty conda environment and installing after activation (thanks @turekg for sharing this workaround):
```
conda create -n learnathon
conda activate learnathon
conda install -c conda-forge python=3.7 ipywidgets beakerx
```
After installation (and possibly activation of the conda environment), navigate to the notebooks directory and start beakerx:
```
cd imklib-tutorial/notebooks
beakerx
```

For a complete list of all available extension I recommend browsing the extension [source code](https://github.com/hanslovsky/imklib/tree/master/src/main/kotlin/net/imglib2/imklib/extensions). Additional examples are available in the [imklib repository](https://github.com/hanslovsky/imklib/tree/master/src/test/kotlin/net/imglib2/imklib/examples), including a few [examples](https://github.com/hanslovsky/imklib/tree/master/examples/kscript) using [kscript](https://github.com/holgerbrandl/kscript). I recommend [IntelliJ IDEA](https://www.jetbrains.com/idea) for browsing and working with Kotlin code. 



