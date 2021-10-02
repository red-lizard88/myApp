package com.example.myapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import android.R.attr.fragment
import android.R.attr.fragment
import android.R.attr.fragment










private lateinit var cardView : CardView

class MainActivity : AppCompatActivity(), FragmentAction, FragmentAction2, FragmentAction3, FragmentAction4,
    FragmentAction5,FragmentAction6,FragmentAction7 {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Обмани меня - Психология тела"


//        findViewById<CardView>(R.id.card1).setOnClickListener{
//        val intent = Intent(this,Activity1::class.java)
//        startActivity(intent)
//        }

//        findViewById<CardView>(R.id.card2).setOnClickListener{
//            val intent = Intent(this,Activity2::class.java)
//            startActivity(intent)
//        }

  fun showFragment(fragment: Fragment){
           supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment)
              commit() }
       }
        showFragment(Fragment_0())

 //       cardView = findViewById(R.id.card1)

//        cardView.setOnClickListener {
//           showFragment(Fragment_1())
//      }




//        findViewById<CardView>(R.id.card1).setOnClickListener {
//            showFragment(Fragment_1())
//        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.getItemId() == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun action() {
        fun showFragment0(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment)
                addToBackStack("Fragment_0")
                commit() }
        }
        showFragment0(Fragment_1())
        showBackArrow()
    }


//// Отдельные карточки

    override fun action9() {
        fun showFragment1(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment1(Fragment1_1())
        showBackArrow()
    }

    override fun action10() {
        fun showFragment7(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment7(Fragment1_2())
        showBackArrow()
    }
    override fun action11() {
        fun showFragment8(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment8(Fragment1_3())
        showBackArrow()
    }
    override fun action12() {
        fun showFragment9(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment9(Fragment1_4())
        showBackArrow()
    }

    override fun action13() {
        fun showFragment10(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment10(Fragment1_5())
        showBackArrow()
    }

    override fun action14() {
        fun showFragment11(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment11(Fragment1_6())
        showBackArrow()
    }

    override fun action15() {
        fun showFragment12(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment12(Fragment1_7())
        showBackArrow()
    }

    override fun action16() {
        fun showFragment13(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment13(Fragment1_8())
        showBackArrow()
    }

    override fun action17() {
        fun showFragment14(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment14(Fragment2_1())
        showBackArrow()
    }

    override fun action18() {
        fun showFragment15(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment15(Fragment2_2())
        showBackArrow()
    }

    override fun action19() {
        fun showFragment16(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment16(Fragment2_3())
        showBackArrow()
    }

    override fun action20() {
        fun showFragment17(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment17(Fragment2_4())
        showBackArrow()
    }

    override fun action21() {
        fun showFragment18(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment18(Fragment2_5())
        showBackArrow()
    }
    override fun action22() {
        fun showFragment19(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment19(Fragment2_6())
        showBackArrow()
    }
    override fun action23() {
        fun showFragment20(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment20(Fragment2_7())
        showBackArrow()
    }
    override fun action24() {
        fun showFragment21(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment21(Fragment2_8())
        showBackArrow()
    }

 ////////// Карточки рукопожатие
 override fun action25() {
     fun showFragment22(fragment: Fragment){
         supportFragmentManager.beginTransaction().apply {
             replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
             commit()
         }
     }
     showFragment22(Fragment3_1())
     showBackArrow()
 }
    override fun action26() {
        fun showFragment23(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment23(Fragment3_2())
        showBackArrow()
    }

    override fun action27() {
        fun showFragment24(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment24(Fragment3_3())
        showBackArrow()
    }

    override fun action28() {
        fun showFragment25(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment25(Fragment3_4())
        showBackArrow()
    }

    override fun action29() {
        fun showFragment26(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment26(Fragment3_5())
        showBackArrow()
    }

/////////////////////// Ноги
override fun action30() {
    fun showFragment27(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
            commit()
        }
    }
    showFragment27(Fragment4_1())
    showBackArrow()
}
    override fun action31() {
        fun showFragment28(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment28(Fragment4_2())
        showBackArrow()
    }
    override fun action32() {
        fun showFragment29(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment29(Fragment4_3())
        showBackArrow()
    }
    override fun action33() {
        fun showFragment30(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment30(Fragment4_4())
        showBackArrow()
    }

    /////////////////////// Туловище
    override fun action34() {
        fun showFragment31(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment31(Fragment5_1())
        showBackArrow()
    }

    override fun action35() {
        fun showFragment32(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment32(Fragment5_2())
        showBackArrow()
    }

    override fun action36() {
        fun showFragment33(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment33(Fragment5_3())
        showBackArrow()
    }
    override fun action37() {
        fun showFragment34(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment34(Fragment5_4())
        showBackArrow()
    }
    override fun action38() {
        fun showFragment35(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment35(Fragment5_5())
        showBackArrow()
    }


    ///////////// Предметы
    override fun action39() {
        fun showFragment36(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment36(Fragment6_1())
        showBackArrow()
    }

    override fun action40() {
        fun showFragment37(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment37(Fragment6_2())
        showBackArrow()
    }
    override fun action41() {
        fun showFragment38(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment38(Fragment6_3())
        showBackArrow()
    }
    override fun action42() {
        fun showFragment39(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment).addToBackStack("Fragment_1")
                commit()
            }
        }
        showFragment39(Fragment6_4())
        showBackArrow()
    }

///////////////////////////////// Подразделы

    override fun action4() {
        fun showFragment2(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment)
                addToBackStack("Fragment_2")
                commit()
            }
        }
        showFragment2(Fragment_2())
        showBackArrow()
    }

    override fun action5() {
        fun showFragment3(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment)
                addToBackStack("Fragment_2")
                commit()
            }
        }
        showFragment3(Fragment_3())
        showBackArrow()
    }
    override fun action6() {
        fun showFragment4(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment)
                addToBackStack("Fragment_2")
                commit()
            }
        }
        showFragment4(Fragment_4())
        showBackArrow()
    }

    override fun action7() {
        fun showFragment5(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment)
                addToBackStack("Fragment_2")
                commit()
            }
        }
        showFragment5(Fragment_5())
        showBackArrow()
    }

    override fun action8() {
        fun showFragment6(fragment: Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.place_holder, fragment)
                addToBackStack("Fragment_2")
                commit()
            }
        }
        showFragment6(Fragment_6())
        showBackArrow()
    }
//    override fun action2() {
//        fun showFragment2(fragment: Fragment){
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.place_holder, fragment).addToBackStack("Fragment_2")
//                commit()
//            }
//        }
//        showFragment2(Fragment_2())
//        showBackArrow()
//    }


///////////////// Кнопки назад

    override fun onBackPressed() {
        if (supportFragmentManager.getBackStackEntryCount()-1 > 0) {
            supportFragmentManager.popBackStack();
            showBackArrow()
        } else {
            supportActionBar?.title = "Обмани меня - Психология тела"
            getActionBar()?.setHomeButtonEnabled(false)
            getActionBar()?.setDisplayHomeAsUpEnabled(false)
            supportActionBar?.setDisplayHomeAsUpEnabled(false)
            super.onBackPressed();
        }
    }

    fun showBackArrow(){
        getActionBar()?.setHomeButtonEnabled(true)
        getActionBar()?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}


