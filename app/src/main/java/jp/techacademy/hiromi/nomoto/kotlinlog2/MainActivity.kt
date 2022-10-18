package jp.techacademy.hiromi.nomoto.kotlinlog2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val d = Log.d("kotlintest", "ログへの出力テスト")

        var num = 10
        Log.d("kotlintest", Integer.toString(num))

        num = 50
        Log.d("kotlintest", num.toString())

        num = 60

        if (num >= 90) {
            Log.d("kotlintest", "優")
        } else if (num >= 75) {
            Log.d("kotlintest", "良")
        } else if (num >= 60) {
            Log.d("kotlintest", "可")
        } else {
            Log.d("kotlintest", "不可")
        }

        val drink = 1

        when (drink) {
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました")
            2 -> Log.d("kotlintest", "オーダーミスです")

        }

        for (i in 1 until 6) {
            Log.d("kotlintest", "for文の" + i + "回目")
        }
        num = 1

        while (num < 6) {
            Log.d("kotlintest", "while文の" + num + "回目")
            num++
        }

        val points = arrayOf(10, 6, 15, 23, 17)

        for (i in points) {
            Log.d("kotlintest", i.toString())
        }

        for (i in points.indices) {
            Log.d("kotlintest", points[i].toString())


        }

        val numA = 100
        val numB = 0
        var ans = 0

        try {

            ans = numA / numB
        } catch (e: Exception) {
            Log.d("kotlintest", "0で割ろうとしました ")
            Log.d("kotlingtest", e.message.toString())
        } finally {
            Log.d("kotlintest", "ans =" + ans.toString())
        }


        Log.d("kotolintest", "ans = " + ans.toString())

        //total(50, 1000)
        // total(1, 1111)

        val t = total(50, 1000)
        Log.d("kotrintest", t.toString())


        val dog = Dog("ポチ", 3)
        dog.move()

        dog.say()
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val dog2 = Dog("ハチ", 10)
        dog2.say()
        Log.d("kotlintest", "犬の名前は" + dog2.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog2.age + "歳です。")


        val bigdog = BigDog("ヨーゼフ", 15)

        bigdog.say()
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")


        val human = Human("yuki", 10, "tennis")
        human.say()
        human.think()

        val human2 = Human ("aya", 30, "travel")
        human2.say()
        human2.think()





    }

    private fun total(first: Int, last: Int): Int {
        var sum = 0
        for (i in first..last) {
            sum += i
        }
        return sum
    }




}


