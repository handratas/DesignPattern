package com.handrata.headfirstdesignpattern.pattern.decorator2

import android.os.Build
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.*
import java.io.*
import java.nio.file.Paths

/**
 * Writing your own Java I/O Decorator
 * Okay, you know the Decorator Pattern, you’ve seen the I/O class diagram. You should be ready to write your own input decorator.
 * How about this: write a decorator that converts all uppercase characters to lowercase in the input stream.
 * In other words, if we read in “I know the Decorator Pattern therefore I RULE!”
 * then your decorator converts this to “i know the decorator pattern therefore i rule!”
* */
class LowerCaseInputStream(inputStream: InputStream) : FilterInputStream(inputStream) {
    @Throws(IOException::class)
    override fun read(): Int {
        val c = super.read()
        return if (c == -1) c else Character.toLowerCase(c.toChar()).toInt()
    }

    @Throws(IOException::class)
    override fun read(b: ByteArray, offset: Int, len: Int): Int {
        val result = super.read(b, offset, len)
        for (i in offset until offset + result) {
            b[i] = Character.toLowerCase(b[i].toChar()).toByte()
        }
        return result
    }
}

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    try {
        val inputStream = LowerCaseInputStream(
            BufferedInputStream(
                FileInputStream(
                    "app/src/main/java/com/handrata/headfirstdesignpattern/pattern/decorator2/test.txt"
                )
            )
        )
        var c: Int
        while (inputStream.read().also { c = it } >= 0) {
            print(c.toChar())
        }
        inputStream.close()
    } catch (e: IOException) {
        e.printStackTrace()
    }
}