package com.example.colorlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridLayout;
    ImageView imageShowDetaile;
    CardView showDetailColorName;
    ArrayList<ColorNameModel> listColorNameModel;
    TextView hexCodeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        setStatusBarColor();
        listeners();
        createListColorWithName();
    }

    private void initComponents(){
        gridLayout=findViewById(R.id.listOfPopularColor);
        hexCodeTextView= findViewById(R.id.hexRgbCode);
        imageShowDetaile = findViewById(R.id.imageShowDetaileA7);
        showDetailColorName=findViewById(R.id.showDetailColorName);
    }
    private void setStatusBarColor(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.tealDark));
        }
    }
    private void listeners(){
        showDetailColorName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDetailColorName.setVisibility(View.GONE);
            }
        });
    }
    private void createListColorWithName(){


        listColorNameModel = new ArrayList<ColorNameModel>();
        listColorNameModel.add(new ColorNameModel("d4c4a8","Akaroa"));
        listColorNameModel.add(new ColorNameModel("c9ffe5","AeroBlue"));
        listColorNameModel.add(new ColorNameModel("93dfb8","AlgaeGreen"));

        listColorNameModel.add(new ColorNameModel("dfbe6f","Apache"));
        listColorNameModel.add(new ColorNameModel("4fa83d","Apple"));
        listColorNameModel.add(new ColorNameModel("7fffd4","Aquamarine"));


        listColorNameModel.add(new ColorNameModel("FF00FF","Fucshia"));
        listColorNameModel.add(new ColorNameModel("808000","Olive"));
        listColorNameModel.add(new ColorNameModel("C0C0C0","Silver"));

        listColorNameModel.add(new ColorNameModel("ff1154d8","RoyalBlue"));
        listColorNameModel.add(new ColorNameModel("ff831d99","Magenta"));
        listColorNameModel.add(new ColorNameModel("ffc30f30","Crimson"));
        listColorNameModel.add(new ColorNameModel("ffbe0a14","FireBrick"));
        listColorNameModel.add(new ColorNameModel("ff14aa20","ForestGreen"));
        listColorNameModel.add(new ColorNameModel("fffff8dc","Cornsilk"));

        listColorNameModel.add(new ColorNameModel("ff35c3fe","DeepSkyBlue"));
        listColorNameModel.add(new ColorNameModel("ff55cbaf","MAquaMarine"));

        listColorNameModel.add(new ColorNameModel("ff129eac","LightSeaGreen"));

        listColorNameModel.add(new ColorNameModel("fffeec","ApricotWhite"));
        listColorNameModel.add(new ColorNameModel("327c14","Bilbao"));
        listColorNameModel.add(new ColorNameModel("67032d","BlackRose"));
        listColorNameModel.add(new ColorNameModel("0d0332","BlackRock"));
        listColorNameModel.add(new ColorNameModel("4d0135","Blackberry"));

        listColorNameModel.add(new ColorNameModel("000000","Black"));
        listColorNameModel.add(new ColorNameModel("ff6600","BlazeOrange"));
        listColorNameModel.add(new ColorNameModel("ffff00","Yellow"));
        listColorNameModel.add(new ColorNameModel("ffffff","White"));
        listColorNameModel.add(new ColorNameModel("0000ff","Blue"));
        listColorNameModel.add(new ColorNameModel("ff0000","Red"));
        listColorNameModel.add(new ColorNameModel("00ff00","Green"));

        listColorNameModel.add(new ColorNameModel("8b00ff","ElectricViolet"));

        listColorNameModel.add(new ColorNameModel("c71585","RedViolet"));
        listColorNameModel.add(new ColorNameModel("991199","EggplantViolet"));
        listColorNameModel.add(new ColorNameModel("f7468a","RoseViolet"));
        listColorNameModel.add(new ColorNameModel("290c5e","ViolentViolet"));
        listColorNameModel.add(new ColorNameModel("e0b0ff","Mauve"));

        listColorNameModel.add(new ColorNameModel("ff66ff","PinkFlamingo"));
        listColorNameModel.add(new ColorNameModel("f77fbe","PersianPink"));
        listColorNameModel.add(new ColorNameModel("fb607f","BrinkPink"));
        listColorNameModel.add(new ColorNameModel("8c055e","CardinalPink"));
        listColorNameModel.add(new ColorNameModel("fc0fc0","ShockingPink"));
        listColorNameModel.add(new ColorNameModel("ff69b4","HotPink"));
        listColorNameModel.add(new ColorNameModel("ff6fff","BlushPink"));
        listColorNameModel.add(new ColorNameModel("ffa6c9","CarnationPink"));
        listColorNameModel.add(new ColorNameModel("f9e0ed","CarouselPink"));
        listColorNameModel.add(new ColorNameModel("ffefec","FairPink"));
        listColorNameModel.add(new ColorNameModel("4b0082","Indigo"));

        listColorNameModel.add(new ColorNameModel("8f021c","Pohutukawa"));
        listColorNameModel.add(new ColorNameModel("b81104","Milano"));
        listColorNameModel.add(new ColorNameModel("e3f988","Mindraro"));
        listColorNameModel.add(new ColorNameModel("8b0723","Monarch"));
        listColorNameModel.add(new ColorNameModel("c7031e","Monza"));
        listColorNameModel.add(new ColorNameModel("1ab385","MountMeadow"));
        listColorNameModel.add(new ColorNameModel("ffdead","NavajoWhite"));
        listColorNameModel.add(new ColorNameModel("000080","NavyBlue"));
        listColorNameModel.add(new ColorNameModel("06a189","Niagara"));
        listColorNameModel.add(new ColorNameModel("02866f","Observatory"));
        listColorNameModel.add(new ColorNameModel("901e1e","OldBrick"));
        listColorNameModel.add(new ColorNameModel("41aa78","OcceanGreen"));

        listColorNameModel.add(new ColorNameModel("6b8e23","OliveDrab"));
        listColorNameModel.add(new ColorNameModel("716e10","Oliveton"));
        listColorNameModel.add(new ColorNameModel("9ab973","Olivine"));
        listColorNameModel.add(new ColorNameModel("7c7631","Pesto"));

        listColorNameModel.add(new ColorNameModel("cdf4ff","Onahau"));
        listColorNameModel.add(new ColorNameModel("377475","Oracle"));
        listColorNameModel.add(new ColorNameModel("ffa000","OrangePeel"));
        listColorNameModel.add(new ColorNameModel("ff681f","Orange"));

        listColorNameModel.add(new ColorNameModel("ff9000","Pizazz"));
        listColorNameModel.add(new ColorNameModel("ffcc99","PeachOrange"));
        listColorNameModel.add(new ColorNameModel("ff6037","Outregeous"));
        listColorNameModel.add(new ColorNameModel("9b4703","Oregon"));
        listColorNameModel.add(new ColorNameModel("015e85","Orient"));
        listColorNameModel.add(new ColorNameModel("f3fbd4","Orinoco"));
        listColorNameModel.add(new ColorNameModel("dafaff","OysterBay"));
        listColorNameModel.add(new ColorNameModel("ff6b53","Persimmon"));
        listColorNameModel.add(new ColorNameModel("009dc4","PacificBlue"));
        listColorNameModel.add(new ColorNameModel("ffdcd6","Schnapps"));
        listColorNameModel.add(new ColorNameModel("ade6c4","Padua"));
        listColorNameModel.add(new ColorNameModel("ffff99","PaleCanary"));
        listColorNameModel.add(new ColorNameModel("fdfeb8","PalePrim"));
        listColorNameModel.add(new ColorNameModel("fadfad","PeachYellow"));
        listColorNameModel.add(new ColorNameModel("ffe1f2","PaleRose"));
        listColorNameModel.add(new ColorNameModel("6e7783","PaleSky"));
        listColorNameModel.add(new ColorNameModel("19339e","PalmBlue"));
        listColorNameModel.add(new ColorNameModel("19330e","PalmLeaf"));
        listColorNameModel.add(new ColorNameModel("f4f2ee","Pampas"));
        listColorNameModel.add(new ColorNameModel("eaf6ee","Panache"));
        listColorNameModel.add(new ColorNameModel("edcdab","Pancho"));
        listColorNameModel.add(new ColorNameModel("ffefd5","PapayaWhip"));
        listColorNameModel.add(new ColorNameModel("8d0226","Paprika"));//monarch
        listColorNameModel.add(new ColorNameModel("317d82","Paradiso"));
        listColorNameModel.add(new ColorNameModel("f1e9d2","Parchment"));
        listColorNameModel.add(new ColorNameModel("fff46e","ParisDaisy"));

        listColorNameModel.add(new ColorNameModel("ffb31f","MySin"));
        listColorNameModel.add(new ColorNameModel("ffdb58","Mustard"));
        listColorNameModel.add(new ColorNameModel("fff39d","Picasso"));
        listColorNameModel.add(new ColorNameModel("26056a","ParisM"));
        listColorNameModel.add(new ColorNameModel("260368","Paua"));
        listColorNameModel.add(new ColorNameModel("cadcd4","ParisWhite"));
        listColorNameModel.add(new ColorNameModel("134f19","Parsley"));
        listColorNameModel.add(new ColorNameModel("77dd77","PastelGreen"));
        listColorNameModel.add(new ColorNameModel("ffd1dc","PastelPink"));
        listColorNameModel.add(new ColorNameModel("639a8f","Patina"));
        listColorNameModel.add(new ColorNameModel("def5ff","PatternsBlue"));
        listColorNameModel.add(new ColorNameModel("d7c498","Pavlova"));
        listColorNameModel.add(new ColorNameModel("ffe5b4","Peach"));
        listColorNameModel.add(new ColorNameModel("fff0db","PeachCream"));

        listColorNameModel.add(new ColorNameModel("782f16","Peanut"));
        listColorNameModel.add(new ColorNameModel("d1e231","Pear"));
        listColorNameModel.add(new ColorNameModel("fcf4dc","PearlLusta"));
        listColorNameModel.add(new ColorNameModel("e8e0d5","PearlBush"));
        listColorNameModel.add(new ColorNameModel("716b56","Peat"));
        listColorNameModel.add(new ColorNameModel("3eabbf","Pelorous"));
        listColorNameModel.add(new ColorNameModel("e3f5e1","Peppermint"));
        listColorNameModel.add(new ColorNameModel("a9bef2","Perano"));
        listColorNameModel.add(new ColorNameModel("d0bef8","Perfume"));
        listColorNameModel.add(new ColorNameModel("e1e6d6","Periglacial"));
        listColorNameModel.add(new ColorNameModel("ccccff","Periwinkle"));
        listColorNameModel.add(new ColorNameModel("c3cde6","PeriwinkleGray"));
        listColorNameModel.add(new ColorNameModel("1c39bb","PersianBlue"));
        listColorNameModel.add(new ColorNameModel("00a693","PersianGreen"));
        listColorNameModel.add(new ColorNameModel("32127a","PersianIndigo"));
        listColorNameModel.add(new ColorNameModel("701c1c","PersianPlum"));
        listColorNameModel.add(new ColorNameModel("cc3333","PersianRed"));
        listColorNameModel.add(new ColorNameModel("fe28a2","PersianRose"));
        listColorNameModel.add(new ColorNameModel("7f3a02","PeruTan"));


        listColorNameModel.add(new ColorNameModel("6e4826","PickledBean"));

        listColorNameModel.add(new ColorNameModel("db9690","PetiteOrchid"));
        listColorNameModel.add(new ColorNameModel("96a8a1","Pewter"));
        listColorNameModel.add(new ColorNameModel("a3807b","Pharlap"));
        listColorNameModel.add(new ColorNameModel("314459","Bluewood"));
        listColorNameModel.add(new ColorNameModel("45b1e8","PictonBlue"));
        listColorNameModel.add(new ColorNameModel("fdd7e4","PigPink"));

        listColorNameModel.add(new ColorNameModel("6d5e54","PineCone"));
        listColorNameModel.add(new ColorNameModel("c7cd90","PineGlade"));
        listColorNameModel.add(new ColorNameModel("01796f","PineGreen"));
        listColorNameModel.add(new ColorNameModel("171f04","PineTree"));

        listColorNameModel.add(new ColorNameModel("ffc0cb","Pink"));

        listColorNameModel.add(new ColorNameModel("ffe1df","Pippin"));
        listColorNameModel.add(new ColorNameModel("ffddf4","PinkLace"));
        listColorNameModel.add(new ColorNameModel("fff1d8","PinkLady"));
        listColorNameModel.add(new ColorNameModel("fef4cc","Pipi"));
        listColorNameModel.add(new ColorNameModel("ff91a4","PinkSalmon"));
        listColorNameModel.add(new ColorNameModel("beb5b7","PinkSwan"));
        listColorNameModel.add(new ColorNameModel("c96323","Piper"));

        listColorNameModel.add(new ColorNameModel("ba7f03","PirateGold"));

        listColorNameModel.add(new ColorNameModel("c99415","Pizza"));
        listColorNameModel.add(new ColorNameModel("9dc209","Pistachio"));
        listColorNameModel.add(new ColorNameModel("c0d8b6","PixieGreen"));
        listColorNameModel.add(new ColorNameModel("27504b","Plantation"));
        listColorNameModel.add(new ColorNameModel("843179","Plum"));
        listColorNameModel.add(new ColorNameModel("e5f9f6","Polar"));
        listColorNameModel.add(new ColorNameModel("8da8cc","PoloBlue"));

        listColorNameModel.add(new ColorNameModel("f34723","Pomegranate"));
        listColorNameModel.add(new ColorNameModel("660045","Pompadour"));
        listColorNameModel.add(new ColorNameModel("eff2f3","Porcelain"));
        listColorNameModel.add(new ColorNameModel("eaae69","Porsche"));
        listColorNameModel.add(new ColorNameModel("251f4f","PortGore"));
        listColorNameModel.add(new ColorNameModel("ffffb4","Portafino"));
        listColorNameModel.add(new ColorNameModel("8b9fee","Portage"));
        listColorNameModel.add(new ColorNameModel("f9e663","Portica"));
        listColorNameModel.add(new ColorNameModel("f5e7e2","PotPourri"));
        listColorNameModel.add(new ColorNameModel("8c5738","PorttersClay"));
        listColorNameModel.add(new ColorNameModel("bcc9c2","PowderAsh"));
        listColorNameModel.add(new ColorNameModel("b0e0e6","PowderBlue"));
        listColorNameModel.add(new ColorNameModel("9a3820","PrairieSand"));
        listColorNameModel.add(new ColorNameModel("d0c0e5","Prelude"));
        listColorNameModel.add(new ColorNameModel("f0e2ec","Prim"));

        listColorNameModel.add(new ColorNameModel("edea99","Primrose"));
        listColorNameModel.add(new ColorNameModel("fef5f1","ProvincialPink"));
        listColorNameModel.add(new ColorNameModel("003153","PrussianBlue"));
        listColorNameModel.add(new ColorNameModel("cc8899","Puce"));
        listColorNameModel.add(new ColorNameModel("7d2c14","Pueblo"));

        listColorNameModel.add(new ColorNameModel("3fc1aa","PuertoRico"));




        GridAdapter objGridAdapter = new GridAdapter(this,R.layout.item_list_color_with_name,listColorNameModel,hexCodeTextView,imageShowDetaile,showDetailColorName);
        gridLayout.setAdapter(objGridAdapter);

    }

}