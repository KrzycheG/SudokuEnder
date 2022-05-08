package com.example.sudokuender

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import kotlin.random.nextInt



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        board()
        Reset.setOnClickListener{board()}
    }
    private fun board() {
        val d = Random.nextInt(1..9);
        val e = Random.nextInt(1..9);
        val f = Random.nextInt(1..9)
        val i = Random.nextInt(1..9);
        val j = Random.nextInt(1..9);
        val k = Random.nextInt(1..9)
        val l = Random.nextInt(1..9);
        val m = Random.nextInt(1..9);
        val n = Random.nextInt(1..9)

        val buttonUsed = arrayListOf<Button>(defaultButton)
        val buttonUse = arrayListOf<Button>(defaultButton)
        val hi = arrayListOf<Button>(
            b1, b2, b3, b4, b5, b6, b7, b8, b9,
            b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22,
            b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35,
            b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46, b47, b48,
            b49, b50, b51, b52, b53, b54, b55, b56, b57, b58, b59, b60, b61,
            b62, b63, b64, b65, b66, b67, b68, b69, b70, b71, b72, b73, b74,
            b75, b76, b77, b78, b79, b80, b81
        )
        var start = 0
        val buttonColor = arrayListOf<Int>()
        var trys=0; var a=0;
        fun keys(buSelected:Button){
            var trats = 0
            var buttonColorSize = buttonColor.size.toInt()

            buSelected.setOnClickListener{
                if(hi.contains(buSelected)){
                    buttonUse.add(buSelected);buttonUse[0].setBackgroundResource(R.drawable.ss);buttonUse.remove(buttonUse[0])
                    buttonUsed[0].setBackgroundResource(R.drawable.ss)
                }
                else{
                    buttonUsed.add(buSelected);buttonUsed[0].setBackgroundResource(R.drawable.ss);buttonUsed.remove(buttonUsed[0])
                    buttonUse[0].setBackgroundResource(R.drawable.ss)
                }
                buSelected.setTextColor(resources.getColor(R.color.purple_200))
                buSelected.setBackgroundColor(Color.BLACK)

                button1.setOnClickListener{buSelected.text= "1";start=0;buSelected.setBackgroundColor(Color.BLACK);start=0;buttonColorSize=buttonColor.size.toInt();trats=0}
                button2.setOnClickListener{buSelected.text= "2";start=0;buSelected.setBackgroundColor(Color.BLACK);start=0;buttonColorSize=buttonColor.size.toInt();trats=0}
                button3.setOnClickListener{buSelected.text= "3";start=0;buSelected.setBackgroundColor(Color.BLACK);start=0;buttonColorSize=buttonColor.size.toInt();trats=0}
                button4.setOnClickListener{buSelected.text= "4";start=0;buSelected.setBackgroundColor(Color.BLACK);start=0;buttonColorSize=buttonColor.size.toInt();trats=0}
                button5.setOnClickListener{buSelected.text= "5";start=0;buSelected.setBackgroundColor(Color.BLACK);start=0;buttonColorSize=buttonColor.size.toInt();trats=0}
                button6.setOnClickListener{buSelected.text= "6";start=0;buSelected.setBackgroundColor(Color.BLACK);start=0;buttonColorSize=buttonColor.size.toInt();trats=0}
                button7.setOnClickListener{buSelected.text= "7";start=0;buSelected.setBackgroundColor(Color.BLACK);start=0;buttonColorSize=buttonColor.size.toInt();trats=0}
                button8.setOnClickListener{buSelected.text= "8";start=0;buSelected.setBackgroundColor(Color.BLACK);start=0;buttonColorSize=buttonColor.size.toInt();trats=0}
                button9.setOnClickListener{buSelected.text= "9";start=0;buSelected.setBackgroundColor(Color.BLACK);start=0;buttonColorSize=buttonColor.size.toInt();trats=0}



            }
        }



        fun check(){
            val ac = 1-a
            if(a<=2){
                Check.setOnClickListener{
                    a++;
                    if(b1.text != "$d"){b1.setBackgroundResource(R.drawable.wrong)};
                    if(b2.text != "$f"){b2.setBackgroundResource(R.drawable.wrong)};
                    if(b3.text != "$k"){b3.setBackgroundResource(R.drawable.wrong)};
                    if(b4.text != "$e"){b4.setBackgroundResource(R.drawable.wrong)};
                    if(b5.text != "$n"){b5.setBackgroundResource(R.drawable.wrong)};
                    if(b6.text != "$l"){b6.setBackgroundResource(R.drawable.wrong)};
                    if(b7.text != "$m"){b7.setBackgroundResource(R.drawable.wrong)};
                    if(b8.text != "$i"){b8.setBackgroundResource(R.drawable.wrong)};
                    if(b9.text != "$j"){b9.setBackgroundResource(R.drawable.wrong)};

                    if(b10.text != "$i"){b10.setBackgroundResource(R.drawable.wrong)};
                    if(b11.text != "$l"){b11.setBackgroundResource(R.drawable.wrong)};
                    if(b12.text != "$m"){b12.setBackgroundResource(R.drawable.wrong)};
                    if(b13.text != "$d"){b13.setBackgroundResource(R.drawable.wrong)};
                    if(b14.text != "$k"){b14.setBackgroundResource(R.drawable.wrong)};
                    if(b15.text != "$j"){b15.setBackgroundResource(R.drawable.wrong)};
                    if(b16.text != "$f"){b16.setBackgroundResource(R.drawable.wrong)};
                    if(b17.text != "$n"){b17.setBackgroundResource(R.drawable.wrong)};
                    if(b18.text != "$e"){b18.setBackgroundResource(R.drawable.wrong)};

                    if(b19.text != "$j"){b19.setBackgroundResource(R.drawable.wrong)};
                    if(b20.text != "$e"){b20.setBackgroundResource(R.drawable.wrong)};
                    if(b21.text != "$n"){b21.setBackgroundResource(R.drawable.wrong)};
                    if(b22.text != "$i"){b22.setBackgroundResource(R.drawable.wrong)};
                    if(b23.text != "$m"){b23.setBackgroundResource(R.drawable.wrong)};
                    if(b24.text != "$f"){b24.setBackgroundResource(R.drawable.wrong)};
                    if(b25.text != "$k"){b25.setBackgroundResource(R.drawable.wrong)};
                    if(b26.text != "$d"){b26.setBackgroundResource(R.drawable.wrong)};
                    if(b27.text != "$l"){b27.setBackgroundResource(R.drawable.wrong)};

                    if(b28.text != "$k"){b28.setBackgroundResource(R.drawable.wrong)};
                    if(b29.text != "$m"){b29.setBackgroundResource(R.drawable.wrong)};
                    if(b30.text != "$f"){b30.setBackgroundResource(R.drawable.wrong)};
                    if(b31.text != "$i"){b31.setBackgroundResource(R.drawable.wrong)};
                    if(b32.text != "$j"){b32.setBackgroundResource(R.drawable.wrong)};
                    if(b33.text != "$n"){b33.setBackgroundResource(R.drawable.wrong)};
                    if(b34.text != "$l"){b34.setBackgroundResource(R.drawable.wrong)};
                    if(b35.text != "$e"){b35.setBackgroundResource(R.drawable.wrong)};
                    if(b36.text != "$d"){b36.setBackgroundResource(R.drawable.wrong)};

                    if(b37.text != "$l"){b37.setBackgroundResource(R.drawable.wrong)};
                    if(b38.text != "$e"){b38.setBackgroundResource(R.drawable.wrong)};
                    if(b39.text != "$n"){b39.setBackgroundResource(R.drawable.wrong)};
                    if(b40.text != "$k"){b40.setBackgroundResource(R.drawable.wrong)};
                    if(b41.text != "$d"){b41.setBackgroundResource(R.drawable.wrong)};
                    if(b42.text != "$f"){b42.setBackgroundResource(R.drawable.wrong)};
                    if(b43.text != "$m"){b43.setBackgroundResource(R.drawable.wrong)};
                    if(b44.text != "$j"){b44.setBackgroundResource(R.drawable.wrong)};
                    if(b45.text != "$i"){b45.setBackgroundResource(R.drawable.wrong)};

                    if(b46.text != "$d"){b46.setBackgroundResource(R.drawable.wrong)};
                    if(b47.text != "$i"){b47.setBackgroundResource(R.drawable.wrong)};
                    if(b48.text != "$j"){b48.setBackgroundResource(R.drawable.wrong)};
                    if(b49.text != "$e"){b49.setBackgroundResource(R.drawable.wrong)};
                    if(b50.text != "$l"){b50.setBackgroundResource(R.drawable.wrong)};
                    if(b51.text != "$m"){b51.setBackgroundResource(R.drawable.wrong)};
                    if(b52.text != "$f"){b52.setBackgroundResource(R.drawable.wrong)};
                    if(b53.text != "$n"){b53.setBackgroundResource(R.drawable.wrong)};
                    if(b54.text != "$k"){b54.setBackgroundResource(R.drawable.wrong)};

                    if(b55.text != "$j"){b55.setBackgroundResource(R.drawable.wrong)};
                    if(b56.text != "$d"){b56.setBackgroundResource(R.drawable.wrong)};
                    if(b57.text != "$i"){b57.setBackgroundResource(R.drawable.wrong)};
                    if(b58.text != "$f"){b58.setBackgroundResource(R.drawable.wrong)};
                    if(b59.text != "$l"){b59.setBackgroundResource(R.drawable.wrong)};
                    if(b60.text != "$m"){b60.setBackgroundResource(R.drawable.wrong)};
                    if(b61.text != "$n"){b61.setBackgroundResource(R.drawable.wrong)};
                    if(b62.text != "$k"){b62.setBackgroundResource(R.drawable.wrong)};
                    if(b63.text != "$e"){b63.setBackgroundResource(R.drawable.wrong)};

                    if(b64.text != "$n"){b64.setBackgroundResource(R.drawable.wrong)};
                    if(b65.text != "$f"){b65.setBackgroundResource(R.drawable.wrong)};
                    if(b66.text != "$l"){b66.setBackgroundResource(R.drawable.wrong)};
                    if(b67.text != "$e"){b67.setBackgroundResource(R.drawable.wrong)};
                    if(b68.text != "$i"){b68.setBackgroundResource(R.drawable.wrong)};
                    if(b69.text != "$k"){b69.setBackgroundResource(R.drawable.wrong)};
                    if(b70.text != "$j"){b70.setBackgroundResource(R.drawable.wrong)};
                    if(b71.text != "$m"){b71.setBackgroundResource(R.drawable.wrong)};
                    if(b72.text != "$d"){b72.setBackgroundResource(R.drawable.wrong)};

                    if(b73.text != "$m"){b73.setBackgroundResource(R.drawable.wrong)};
                    if(b74.text != "$k"){b74.setBackgroundResource(R.drawable.wrong)};
                    if(b75.text != "$e"){b75.setBackgroundResource(R.drawable.wrong)};
                    if(b76.text != "$n"){b76.setBackgroundResource(R.drawable.wrong)};
                    if(b77.text != "$j"){b77.setBackgroundResource(R.drawable.wrong)};
                    if(b78.text != "$d"){b78.setBackgroundResource(R.drawable.wrong)};
                    if(b79.text != "$l"){b79.setBackgroundResource(R.drawable.wrong)};
                    if(b80.text != "$f"){b80.setBackgroundResource(R.drawable.wrong)};
                    if(b81.text != "$i"){b81.setBackgroundResource(R.drawable.wrong)};

                    if(b1.text == "$d"&&b2.text == "$f" && b3.text == "$k"&&
                        b4.text == "$e"&&b5.text == "$n" && b6.text == "$l"&&
                        b7.text == "$m"&&b8.text == "$i" && b9.text == "$j"&&

                        b10.text == "$i"&& b11.text == "$l" && b12.text == "$m"&&
                        b13.text == "$d"&&b14.text == "$k" && b15.text == "$j"&&
                        b16.text == "$f"&&b17.text == "$n" && b18.text == "$e"&&

                        b19.text == "$j"&&b20.text == "$e" && b21.text == "$n"&&
                        b22.text == "$i"&&b23.text == "$m" && b24.text == "$f"&&
                        b25.text == "$k"&&b26.text == "$d" && b27.text == "$l"&&

                        b28.text == "$k"&&b29.text == "$m" && b30.text == "$f"&&
                        b31.text == "$i"&&b32.text == "$j" && b33.text == "$n"&&
                        b34.text == "$l"&&b35.text == "$e" && b36.text == "$d"&&

                        b37.text == "$l"&&b38.text == "$e" && b39.text == "$n"&&
                        b40.text == "$k"&&b41.text == "$d" && b42.text == "$f"&&
                        b43.text == "$m"&&b44.text == "$j" && b45.text == "$i"&&

                        b46.text == "$d"&&b47.text == "$i" && b48.text == "$j"&&
                        b49.text == "$e"&&b50.text == "$l" && b51.text == "$m"&&
                        b52.text == "$f"&&b53.text == "$n" && b54.text == "$k"&&

                        b55.text == "$j"&&b56.text == "$d" && b57.text == "$i"&&
                        b58.text == "$f"&&b59.text == "$l" && b60.text == "$m"&&
                        b61.text == "$n"&&b62.text == "$k" && b63.text == "$e"&&

                        b64.text == "$n"&&b65.text == "$f" && b66.text == "$l"&&
                        b67.text == "$e"&&b68.text == "$i" && b69.text == "$k"&&
                        b70.text == "$j"&&b71.text == "$m" && b72.text == "$d"&&

                        b73.text == "$m"&&b74.text == "$k" && b75.text == "$e"&&
                        b76.text == "$n"&&b77.text == "$j" && b78.text == "$d"&&
                        b79.text == "$l"&&b80.text == "$f" && b81.text == "$i"){
                        win++
                        Toast.makeText(this,"You Win !",Toast.LENGTH_SHORT).show()
                        Handler().postDelayed({
                            board()
                        },1250)
                    }else if (a==2){
                        Toast.makeText(this,"You Lose",Toast.LENGTH_SHORT).show()
                        lose++
                        Handler().postDelayed({
                            board()
                        },1250)
                    }else{Toast.makeText(this,"You have $ac more checks left",Toast.LENGTH_SHORT).show()}
                }
            }
        }
        check()

        if(d != e && d!= f && f !=e) {
            if(i != j && i!=k && k!=j && d!=i && d!=j && d!=k && e!=i && e!=j && e!=k && f!=i && f!=j && f!=k) {
                if(l !=m && l!=n && n!=m && d!=l && d!=m && d!=n && e!=l && e!=m && e!=n && f!=l && f!=m && f!=n && i!=l && i!=m && i!=n && j!=l && j!=m && j!=n && k!=l && k!=m && k!=n ) {
                    //Block 1
                    b1.text= "$d";b1.setBackgroundResource(R.drawable.ss);b1.setOnClickListener{b1.text = "$d"}
                    b2.text= "$f";b2.setBackgroundResource(R.drawable.ss);b2.setOnClickListener{b2.text = "$f"}
                    b3.text= "$k";b3.setBackgroundResource(R.drawable.ss);b3.setOnClickListener{b3.text = "$k"}
                    b4.text= "$e";b4.setBackgroundResource(R.drawable.ss);b4.setOnClickListener{b4.text = "$e"}
                    b5.text= "$n";b5.setBackgroundResource(R.drawable.ss);b5.setOnClickListener{b5.text = "$n"}
                    b6.text= "$l";b6.setBackgroundResource(R.drawable.ss);b6.setOnClickListener{b6.text = "$l"}
                    b7.text= "$m";b7.setBackgroundResource(R.drawable.ss);b7.setOnClickListener{b7.text = "$m"}
                    b8.text= "$i";b8.setBackgroundResource(R.drawable.ss);b8.setOnClickListener{b8.text = "$i"}
                    b9.text= "$j";b9.setBackgroundResource(R.drawable.ss);b9.setOnClickListener{b9.text = "$j"}
                    //Block 2
                    b10.text= "$i";b10.setBackgroundResource(R.drawable.ss1);b10.setOnClickListener{b10.text = "$i"}
                    b11.text= "$l";b11.setBackgroundResource(R.drawable.ss1);b11.setOnClickListener{b11.text = "$l"}
                    b12.text= "$m";b12.setBackgroundResource(R.drawable.ss1);b12.setOnClickListener{b12.text = "$m"}
                    b13.text= "$d";b13.setBackgroundResource(R.drawable.ss1);b13.setOnClickListener{b13.text = "$d"}
                    b14.text= "$k";b14.setBackgroundResource(R.drawable.ss1);b14.setOnClickListener{b14.text = "$k"}
                    b15.text= "$j";b15.setBackgroundResource(R.drawable.ss1);b15.setOnClickListener{b15.text = "$j"}
                    b16.text= "$f";b16.setBackgroundResource(R.drawable.ss1);b16.setOnClickListener{b16.text = "$f"}
                    b17.text= "$n";b17.setBackgroundResource(R.drawable.ss1);b17.setOnClickListener{b17.text = "$n"}
                    b18.text= "$e";b18.setBackgroundResource(R.drawable.ss1);b18.setOnClickListener{b18.text = "$e"}
                    //Block 3
                    b19.text= "$j";b19.setBackgroundResource(R.drawable.ss);b19.setOnClickListener{b19.text = "$j"}
                    b20.text= "$e";b20.setBackgroundResource(R.drawable.ss);b20.setOnClickListener{b20.text = "$e"}
                    b21.text= "$n";b21.setBackgroundResource(R.drawable.ss);b21.setOnClickListener{b21.text = "$n"}
                    b22.text= "$i";b22.setBackgroundResource(R.drawable.ss);b22.setOnClickListener{b22.text = "$i"}
                    b23.text= "$m";b23.setBackgroundResource(R.drawable.ss);b23.setOnClickListener{b23.text = "$m"}
                    b24.text= "$f";b24.setBackgroundResource(R.drawable.ss);b24.setOnClickListener{b24.text = "$f"}
                    b25.text= "$k";b25.setBackgroundResource(R.drawable.ss);b25.setOnClickListener{b25.text = "$k"}
                    b26.text= "$d";b26.setBackgroundResource(R.drawable.ss);b26.setOnClickListener{b26.text = "$d"}
                    b27.text= "$l";b26.setBackgroundResource(R.drawable.ss);b26.setOnClickListener{b26.text = "$l"}
                    //Block 4
                    b28.text= "$k";b28.setBackgroundResource(R.drawable.ss1);b28.setOnClickListener{b28.text = "$k"}
                    b29.text= "$m";b29.setBackgroundResource(R.drawable.ss1);b29.setOnClickListener{b29.text = "$m"}
                    b30.text= "$f";b30.setBackgroundResource(R.drawable.ss1);b30.setOnClickListener{b30.text = "$f"}
                    b31.text= "$i";b31.setBackgroundResource(R.drawable.ss1);b31.setOnClickListener{b31.text = "$i"}
                    b32.text= "$j";b32.setBackgroundResource(R.drawable.ss1);b32.setOnClickListener{b32.text = "$j"}
                    b33.text= "$n";b33.setBackgroundResource(R.drawable.ss1);b33.setOnClickListener{b33.text = "$n"}
                    b34.text= "$l";b34.setBackgroundResource(R.drawable.ss1);b34.setOnClickListener{b34.text = "$l"}
                    b35.text= "$e";b35.setBackgroundResource(R.drawable.ss1);b35.setOnClickListener{b35.text = "$e"}
                    b36.text= "$d";b36.setBackgroundResource(R.drawable.ss1);b36.setOnClickListener{b36.text = "$d"}
                    //Block 5
                    b37.text= "$l";b37.setBackgroundResource(R.drawable.ss);b37.setOnClickListener{b37.text = "$l"}
                    b38.text= "$e";b38.setBackgroundResource(R.drawable.ss);b38.setOnClickListener{b38.text = "$e"}
                    b39.text= "$n";b39.setBackgroundResource(R.drawable.ss);b39.setOnClickListener{b39.text = "$n"}
                    b40.text= "$k";b40.setBackgroundResource(R.drawable.ss);b40.setOnClickListener{b40.text = "$k"}
                    b41.text= "$d";b41.setBackgroundResource(R.drawable.ss);b41.setOnClickListener{b41.text = "$d"}
                    b42.text= "$f";b42.setBackgroundResource(R.drawable.ss);b42.setOnClickListener{b42.text = "$f"}
                    b43.text= "$m";b43.setBackgroundResource(R.drawable.ss);b43.setOnClickListener{b43.text = "$m"}
                    b44.text= "$j";b44.setBackgroundResource(R.drawable.ss);b44.setOnClickListener{b44.text = "$j"}
                    b45.text= "$i";b45.setBackgroundResource(R.drawable.ss);b45.setOnClickListener{b45.text = "$i"}
                    //Block 6
                    b46.text= "$d";b46.setBackgroundResource(R.drawable.ss1);b46.setOnClickListener{b46.text = "$d"}
                    b47.text= "$i";b47.setBackgroundResource(R.drawable.ss1);b47.setOnClickListener{b47.text = "$i"}
                    b48.text= "$j";b48.setBackgroundResource(R.drawable.ss1);b48.setOnClickListener{b48.text = "$j"}
                    b49.text= "$e";b49.setBackgroundResource(R.drawable.ss1);b49.setOnClickListener{b49.text = "$e"}
                    b50.text= "$l";b50.setBackgroundResource(R.drawable.ss1);b50.setOnClickListener{b50.text = "$l"}
                    b51.text= "$m";b51.setBackgroundResource(R.drawable.ss1);b51.setOnClickListener{b51.text = "$m"}
                    b52.text= "$f";b52.setBackgroundResource(R.drawable.ss1);b52.setOnClickListener{b52.text = "$f"}
                    b53.text= "$n";b53.setBackgroundResource(R.drawable.ss1);b53.setOnClickListener{b53.text = "$n"}
                    b54.text= "$k";b54.setBackgroundResource(R.drawable.ss1);b54.setOnClickListener{b54.text = "$k"}
                    //Block 7
                    b55.text= "$j";b55.setBackgroundResource(R.drawable.ss);b55.setOnClickListener{b55.text = "$j"}
                    b56.text= "$d";b56.setBackgroundResource(R.drawable.ss);b56.setOnClickListener{b56.text = "$d"}
                    b57.text= "$i";b57.setBackgroundResource(R.drawable.ss);b57.setOnClickListener{b57.text = "$i"}
                    b58.text= "$f";b58.setBackgroundResource(R.drawable.ss);b58.setOnClickListener{b58.text = "$f"}
                    b59.text= "$l";b59.setBackgroundResource(R.drawable.ss);b59.setOnClickListener{b59.text = "$l"}
                    b60.text= "$m";b60.setBackgroundResource(R.drawable.ss);b60.setOnClickListener{b60.text = "$m"}
                    b61.text= "$n";b61.setBackgroundResource(R.drawable.ss);b61.setOnClickListener{b61.text = "$n"}
                    b62.text= "$k";b62.setBackgroundResource(R.drawable.ss);b62.setOnClickListener{b62.text = "$k"}
                    b63.text= "$e";b63.setBackgroundResource(R.drawable.ss);b63.setOnClickListener{b63.text = "$e"}
                    //Block 8
                    b64.text= "$n";b64.setBackgroundResource(R.drawable.ss1);b64.setOnClickListener{b64.text = "$n"}
                    b65.text= "$f";b65.setBackgroundResource(R.drawable.ss1);b65.setOnClickListener{b65.text = "$f"}
                    b66.text= "$l";b66.setBackgroundResource(R.drawable.ss1);b66.setOnClickListener{b66.text = "$l"}
                    b67.text= "$e";b67.setBackgroundResource(R.drawable.ss1);b67.setOnClickListener{b67.text = "$e"}
                    b68.text= "$i";b68.setBackgroundResource(R.drawable.ss1);b68.setOnClickListener{b68.text = "$i"}
                    b69.text= "$k";b69.setBackgroundResource(R.drawable.ss1);b69.setOnClickListener{b69.text = "$k"}
                    b70.text= "$j";b70.setBackgroundResource(R.drawable.ss1);b70.setOnClickListener{b70.text = "$j"}
                    b71.text= "$m";b71.setBackgroundResource(R.drawable.ss1);b71.setOnClickListener{b71.text = "$m"}
                    b72.text= "$d";b72.setBackgroundResource(R.drawable.ss1);b72.setOnClickListener{b72.text = "$d"}
                    //Block 9
                    b73.text= "$m";b73.setBackgroundResource(R.drawable.ss);b73.setOnClickListener{b73.text = "$m"}
                    b74.text= "$k";b74.setBackgroundResource(R.drawable.ss);b74.setOnClickListener{b74.text = "$k"}
                    b75.text= "$e";b75.setBackgroundResource(R.drawable.ss);b75.setOnClickListener{b75.text = "$e"}
                    b76.text= "$n";b76.setBackgroundResource(R.drawable.ss);b76.setOnClickListener{b76.text = "$n"}
                    b77.text= "$j";b77.setBackgroundResource(R.drawable.ss);b77.setOnClickListener{b77.text = "$j"}
                    b78.text= "$d";b78.setBackgroundResource(R.drawable.ss);b78.setOnClickListener{b78.text = "$d"}
                    b79.text= "$l";b79.setBackgroundResource(R.drawable.ss);b79.setOnClickListener{b79.text = "$l"}
                    b80.text= "$f";b80.setBackgroundResource(R.drawable.ss);b80.setOnClickListener{b80.text = "$f"}
                    b81.text= "$i";b81.setBackgroundResource(R.drawable.ss);b81.setOnClickListener{b81.text = "$i"}

                    //Clear cells
                    val random = Random.nextInt(50..53)
                    var a = 0
                    while(a<=random) {
                        when(Random.nextInt(1..81)){
                            1->{b1.text="";keys(buSelected = b1);b1.setBackgroundResource(R.drawable.ss)}
                            2->{b2.text="";keys(buSelected = b2);b2.setBackgroundResource(R.drawable.ss)}
                            3->{b3.text="";keys(buSelected = b3);b3.setBackgroundResource(R.drawable.ss)}
                            4->{b4.text="";keys(buSelected = b4);b4.setBackgroundResource(R.drawable.ss)}
                            5->{b5.text="";keys(buSelected = b5);b5.setBackgroundResource(R.drawable.ss)}
                            6->{b6.text="";keys(buSelected = b6);b6.setBackgroundResource(R.drawable.ss)}
                            7->{b7.text="";keys(buSelected = b7);b7.setBackgroundResource(R.drawable.ss)}
                            8->{b8.text="";keys(buSelected = b8);b8.setBackgroundResource(R.drawable.ss)}
                            9->{b9.text="";keys(buSelected = b9);b9.setBackgroundResource(R.drawable.ss)}

                            10->{b10.text="";keys(buSelected = b10);b10.setBackgroundResource(R.drawable.ss1)}
                            11->{b11.text="";keys(buSelected = b11);b11.setBackgroundResource(R.drawable.ss1)}
                            12->{b12.text="";keys(buSelected = b12);b12.setBackgroundResource(R.drawable.ss1)}
                            13->{b13.text="";keys(buSelected = b13);b13.setBackgroundResource(R.drawable.ss1)}
                            14->{b14.text="";keys(buSelected = b14);b14.setBackgroundResource(R.drawable.ss1)}
                            15->{b15.text="";keys(buSelected = b15);b15.setBackgroundResource(R.drawable.ss1)}
                            16->{b16.text="";keys(buSelected = b16);b16.setBackgroundResource(R.drawable.ss1)}
                            17->{b17.text="";keys(buSelected = b17);b17.setBackgroundResource(R.drawable.ss1)}
                            18->{b18.text="";keys(buSelected = b18);b18.setBackgroundResource(R.drawable.ss1)}

                            19->{b19.text="";keys(buSelected = b19);b19.setBackgroundResource(R.drawable.ss)}
                            20->{b20.text="";keys(buSelected = b20);b20.setBackgroundResource(R.drawable.ss)}
                            21->{b21.text="";keys(buSelected = b21);b21.setBackgroundResource(R.drawable.ss)}
                            22->{b22.text="";keys(buSelected = b22);b22.setBackgroundResource(R.drawable.ss)}
                            23->{b23.text="";keys(buSelected = b23);b23.setBackgroundResource(R.drawable.ss)}
                            24->{b24.text="";keys(buSelected = b24);b24.setBackgroundResource(R.drawable.ss)}
                            25->{b25.text="";keys(buSelected = b25);b25.setBackgroundResource(R.drawable.ss)}
                            26->{b26.text="";keys(buSelected = b26);b26.setBackgroundResource(R.drawable.ss)}
                            27->{b27.text="";keys(buSelected = b27);b27.setBackgroundResource(R.drawable.ss)}

                            28->{b28.text="";keys(buSelected = b28);b28.setBackgroundResource(R.drawable.ss1)}
                            29->{b29.text="";keys(buSelected = b29);b29.setBackgroundResource(R.drawable.ss1)}
                            30->{b30.text="";keys(buSelected = b30);b30.setBackgroundResource(R.drawable.ss1)}
                            31->{b31.text="";keys(buSelected = b31);b31.setBackgroundResource(R.drawable.ss1)}
                            32->{b32.text="";keys(buSelected = b32);b32.setBackgroundResource(R.drawable.ss1)}
                            33->{b33.text="";keys(buSelected = b33);b33.setBackgroundResource(R.drawable.ss1)}
                            34->{b34.text="";keys(buSelected = b34);b34.setBackgroundResource(R.drawable.ss1)}
                            35->{b35.text="";keys(buSelected = b35);b35.setBackgroundResource(R.drawable.ss1)}
                            36->{b36.text="";keys(buSelected = b36);b36.setBackgroundResource(R.drawable.ss1)}

                            37->{b37.text="";keys(buSelected = b37);b37.setBackgroundResource(R.drawable.ss)}
                            38->{b38.text="";keys(buSelected = b38);b38.setBackgroundResource(R.drawable.ss)}
                            39->{b39.text="";keys(buSelected = b39);b39.setBackgroundResource(R.drawable.ss)}
                            40->{b40.text="";keys(buSelected = b40);b40.setBackgroundResource(R.drawable.ss)}
                            41->{b41.text="";keys(buSelected = b41);b41.setBackgroundResource(R.drawable.ss)}
                            42->{b42.text="";keys(buSelected = b42);b42.setBackgroundResource(R.drawable.ss)}
                            43->{b43.text="";keys(buSelected = b43);b43.setBackgroundResource(R.drawable.ss)}
                            44->{b44.text="";keys(buSelected = b44);b44.setBackgroundResource(R.drawable.ss)}
                            45->{b45.text="";keys(buSelected = b45);b45.setBackgroundResource(R.drawable.ss)}

                            46->{b46.text="";keys(buSelected = b46);b46.setBackgroundResource(R.drawable.ss1)}
                            47->{b47.text="";keys(buSelected = b47);b47.setBackgroundResource(R.drawable.ss1)}
                            48->{b48.text="";keys(buSelected = b48);b48.setBackgroundResource(R.drawable.ss1)}
                            49->{b49.text="";keys(buSelected = b49);b49.setBackgroundResource(R.drawable.ss1)}
                            50->{b50.text="";keys(buSelected = b50);b50.setBackgroundResource(R.drawable.ss1)}
                            51->{b51.text="";keys(buSelected = b51);b51.setBackgroundResource(R.drawable.ss1)}
                            52->{b52.text="";keys(buSelected = b52);b52.setBackgroundResource(R.drawable.ss1)}
                            53->{b53.text="";keys(buSelected = b53);b53.setBackgroundResource(R.drawable.ss1)}
                            54->{b54.text="";keys(buSelected = b54);b54.setBackgroundResource(R.drawable.ss1)}

                            55->{b55.text="";keys(buSelected = b55);b55.setBackgroundResource(R.drawable.ss)}
                            56->{b56.text="";keys(buSelected = b56);b56.setBackgroundResource(R.drawable.ss)}
                            57->{b57.text="";keys(buSelected = b57);b57.setBackgroundResource(R.drawable.ss)}
                            58->{b58.text="";keys(buSelected = b58);b58.setBackgroundResource(R.drawable.ss)}
                            59->{b59.text="";keys(buSelected = b59);b59.setBackgroundResource(R.drawable.ss)}
                            60->{b60.text="";keys(buSelected = b60);b60.setBackgroundResource(R.drawable.ss)}
                            61->{b61.text="";keys(buSelected = b61);b61.setBackgroundResource(R.drawable.ss)}
                            62->{b62.text="";keys(buSelected = b62);b62.setBackgroundResource(R.drawable.ss)}
                            63->{b63.text="";keys(buSelected = b63);b63.setBackgroundResource(R.drawable.ss)}

                            64->{b64.text="";keys(buSelected = b64);b64.setBackgroundResource(R.drawable.ss1)}
                            65->{b65.text="";keys(buSelected = b65);b65.setBackgroundResource(R.drawable.ss1)}
                            66->{b66.text="";keys(buSelected = b66);b66.setBackgroundResource(R.drawable.ss1)}
                            67->{b67.text="";keys(buSelected = b67);b67.setBackgroundResource(R.drawable.ss1)}
                            68->{b68.text="";keys(buSelected = b68);b68.setBackgroundResource(R.drawable.ss1)}
                            69->{b69.text="";keys(buSelected = b69);b69.setBackgroundResource(R.drawable.ss1)}
                            70->{b70.text="";keys(buSelected = b70);b70.setBackgroundResource(R.drawable.ss1)}
                            71->{b71.text="";keys(buSelected = b71);b71.setBackgroundResource(R.drawable.ss1)}
                            72->{b72.text="";keys(buSelected = b72);b72.setBackgroundResource(R.drawable.ss1)}

                            73->{b73.text="";keys(buSelected = b73);b73.setBackgroundResource(R.drawable.ss)}
                            74->{b74.text="";keys(buSelected = b74);b74.setBackgroundResource(R.drawable.ss)}
                            75->{b75.text="";keys(buSelected = b75);b75.setBackgroundResource(R.drawable.ss)}
                            76->{b76.text="";keys(buSelected = b76);b76.setBackgroundResource(R.drawable.ss)}
                            77->{b77.text="";keys(buSelected = b77);b77.setBackgroundResource(R.drawable.ss)}
                            78->{b78.text="";keys(buSelected = b78);b78.setBackgroundResource(R.drawable.ss)}
                            79->{b79.text="";keys(buSelected = b79);b79.setBackgroundResource(R.drawable.ss)}
                            80->{b80.text="";keys(buSelected = b80);b80.setBackgroundResource(R.drawable.ss)}
                            81->{b81.text="";keys(buSelected = b81);b81.setBackgroundResource(R.drawable.ss)}

                        }
                        a++
                    }
                }
                else if(l==m || l==n || n==m ||d==l ||d==m || d==n ||e==l||e==m||e==n||f==l||f==m||f==n||i==l||i==m||i==n||j==l||j==m||j==n||k==l||k==m||k==n){board()}
            }
            else if(i==j || i==k || k==j || d==i || d==j || d==k || e==i || e==j || e==k || f==i || f==j || f==k){board()}
        }
        else if(d == e || d==f || f ==e){ board()}
    }
}