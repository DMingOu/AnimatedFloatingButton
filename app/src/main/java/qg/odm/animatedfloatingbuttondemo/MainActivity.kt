package qg.odm.animatedfloatingbuttondemo

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import qg.odm.animatedfloatingbutton.AnimatedFloatingButton

class MainActivity : AppCompatActivity() {

    var fbtn_1 : AnimatedFloatingButton ?= null
    var fbtn_2 : AnimatedFloatingButton ?= null
    var fbtn_3 : AnimatedFloatingButton ?= null
    var fbtnCus : AnimatedFloatingButton ?= null

    var btnShowAnim : Button ?= null
    var btnHideAnim : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowAnim = this.findViewById(R.id.btn_showAnim)
        btnShowAnim?.text = "出场"
        btnHideAnim = this.findViewById(R.id.btn_hideAnim)
        btnHideAnim?.text = "隐藏"

        btnShowAnim?.setOnClickListener {
            startShowAnim()
        }
        btnHideAnim?.setOnClickListener {
            startHideAnim()
        }


        fbtn_1 = this.findViewById(R.id.aFb_1) as AnimatedFloatingButton
        fbtn_1?.setAnimationType(AnimatedFloatingButton.AnimationType.TRANSLATION_UP_DOWN)
        fbtn_1?.setOnClickListener {
            Toast.makeText(this,it.id,Toast.LENGTH_SHORT).show()
        }
        fbtn_2 = this.findViewById(R.id.aFb_2) as AnimatedFloatingButton
        fbtn_2?.setAnimationType(AnimatedFloatingButton.AnimationType.SCALE)
        fbtn_2?.setOnClickListener {
            Toast.makeText(this,it.id,Toast.LENGTH_SHORT).show()
        }
        fbtn_3 = this.findViewById(R.id.aFB_3) as AnimatedFloatingButton
        fbtn_3?.setAnimationType(AnimatedFloatingButton.AnimationType.TRANSLATION_DOWN_UP)
        fbtn_3?.setOnClickListener {
            Toast.makeText(this,it.id,Toast.LENGTH_SHORT).show()
        }
        fbtnCus = this.findViewById(R.id.aFB_custom) as AnimatedFloatingButton
        fbtnCus?.setOnClickListener {
            Toast.makeText(this,it.id,Toast.LENGTH_SHORT).show()
        }
        val animator1: ObjectAnimator = ObjectAnimator.ofFloat( fbtnCus  , "rotationX", 0.0f, 180.0f)
        animator1.duration = 1000
        val animator2: ObjectAnimator = ObjectAnimator.ofFloat( fbtnCus  , "rotationX", 180.0f, 0.0f)
        animator2.duration = 1000
        fbtnCus?.setCustomAnimator(animator2 , animator1)


    }

    fun  startShowAnim(){
        fbtn_1?.showAnimation()
        fbtn_2?.showAnimation()
        fbtn_3?.showAnimation()
        fbtnCus?.showAnimation()
    }

    fun  startHideAnim(){
        fbtn_1?.hideAnimation()
        fbtn_2?.hideAnimation()
        fbtn_3?.hideAnimation()
        fbtnCus?.hideAnimation()
    }


}
