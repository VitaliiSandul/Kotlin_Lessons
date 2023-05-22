package com.example.qrgenerator_2

import android.graphics.Bitmap
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.google.zxing.BarcodeFormat
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.google.zxing.qrcode.QRCodeWriter

class MainActivity : AppCompatActivity() {
    var im: ImageView? = null
    var bGenerate: Button? = null
    var edTxt: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        im = findViewById(R.id.imageView)
        bGenerate = findViewById(R.id.button)
        edTxt = findViewById(R.id.edText)

        bGenerate?.setOnClickListener {
            generateQrCode(edTxt?.text.toString())
        }
    }

    private fun generateQrCode(text: String) {
//        val qrGenerator = QRGEncoder(text, null, QRGContents.Type.TEXT, 700)
//        try {
//            val bMap = qrGenerator.bitmap
//            im?.setImageBitmap(bMap)
//
//        } catch(e: Exception){
//
//        }
        val writer = QRCodeWriter()
        try {
            val bitMatrix: BitMatrix = writer.encode(text, BarcodeFormat.QR_CODE, 512, 512)
            val width: Int = bitMatrix.getWidth()
            val height: Int = bitMatrix.getHeight()
            val bmp = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565)
            for (x in 0 until width) {
                for (y in 0 until height) {
                    bmp.setPixel(x, y, if (bitMatrix.get(x, y)) Color.BLACK else Color.WHITE)
                }
            }
            im?.setImageBitmap(bmp)
        } catch (e: WriterException) {
            e.printStackTrace()
        }
    }
}