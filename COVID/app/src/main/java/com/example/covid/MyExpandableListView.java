package com.example.covid;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyExpandableListView extends AppCompatActivity {
    AdView mAdView;
    ExpandableListView expandableListView;
    TextView header;
    String content ="Some Q&A About Corona Virus from WHO(World Health Organization)";

    List<String> question;
    Map<String,List<String>> anser;
    ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_expandable_list_view);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        header = findViewById(R.id.header);
        header.setText(content);

        expandableListView = findViewById(R.id.expandable_list);
        fillData();
        listAdapter = new MyExpandableAdapter(this,question,anser);
        expandableListView.setAdapter(listAdapter);
    }


    public void fillData(){
        question = new ArrayList<>();
        anser = new HashMap<>();

        question.add("1) What is CoronaVirus");
        question.add("2) What is COVID-19 ?");
        question.add("3) What are the symptoms of COVID-19 ?");
        question.add("4) How does COVID-19 spread?");
        question.add("5) Can the virus that causes COVID-19 be transmitted through the air?");
        question.add("6) Can COVID-19 be caught from a person who has no symptoms?");
        question.add("7) Can I catch COVID-19 from the feces of someone with the disease?");
        question.add("8) Who is at risk of developing severe illness?");
        question.add("9) Are antibiotics effective in preventing or treating the COVID-19?");
        question.add("10) Are there any medicines or therapies that can prevent or cure COVID-19?");
        question.add("11) Is there a vaccine,drug or treatment for COVID-19?");
        question.add("12) Is COVID-19 the same as SARS?");
        question.add("13) Should I were a mask to protect myself?");
        question.add("14) How long is the incubation period for COVID-19?");
        question.add("15) Can humans becomes infected with the COVID-19 from ananimal sourse?");
        question.add("16) Can I catch COVID-19 frommy pet?");
        question.add("17) Is there anything I should not do?");
        question.add("18) How did the first human SARS-CoV-2 infection occur?");

        List<String> zero = new ArrayList<>();
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        List<String> three = new ArrayList<>();
        List<String> four = new ArrayList<>();
        List<String> five = new ArrayList<>();
        List<String> six = new ArrayList<>();
        List<String> seven = new ArrayList<>();
        List<String> eight= new ArrayList<>();
        List<String> nine= new ArrayList<>();
        List<String> ten = new ArrayList<>();
        List<String> eleven = new ArrayList<>();
        List<String> twelve = new ArrayList<>();
        List<String> thirteen = new ArrayList<>();
        List<String> fourteen = new ArrayList<>();
        List<String> fifteen = new ArrayList<>();
        List<String> sixteen = new ArrayList<>();
        List<String> seventeen = new ArrayList<>();
        List<String> eighteen = new ArrayList<>();
        List<String> nineteen = new ArrayList<>();

        zero.add("Coronaviruses are a large family of viruses which may cause illness in animals or humans.  In humans, several coronaviruses are known to cause respiratory infections ranging from the common cold to more severe diseases such as Middle East Respiratory Syndrome (MERS) and Severe Acute Respiratory Syndrome (SARS). The most recently discovered coronavirus causes coronavirus disease COVID-19.");
        one.add("COVID-19 is the infectious disease caused by the most recently discovered coronavirus. This new virus and disease were unknown before the outbreak began in Wuhan, China, in December 2019.");
        two.add("The most common symptoms of COVID-19 are fever, tiredness, and dry cough. Some patients may have aches and pains, nasal congestion, runny nose, sore throat or diarrhea. These symptoms are usually mild and begin gradually. Some people become infected but don’t develop any symptoms and don't feel unwell. Most people (about 80%) recover from the disease without needing special treatment. Around 1 out of every 6 people who gets COVID-19 becomes seriously ill and develops difficulty breathing. Older people, and those with underlying medical problems like high blood pressure, heart problems or diabetes, are more likely to develop serious illness. People with fever, cough and difficulty breathing should seek medical attention.\n" +
                "\n");
        three.add("People can catch COVID-19 from others who have the virus. The disease can spread from person to person through small droplets from the nose or mouth which are spread when a person with COVID-19 coughs or exhales. These droplets land on objects and surfaces around the person. Other people then catch COVID-19 by touching these objects or surfaces, then touching their eyes, nose or mouth. People can also catch COVID-19 if they breathe in droplets from a person with COVID-19 who coughs out or exhales droplets. This is why it is important to stay more than 1 meter (3 feet) away from a person who is sick.\n" +
                "\n" +
                "WHO is assessing ongoing research on the ways COVID-19 is spread and will continue to share updated findings.");
        four.add("Studies to date suggest that the virus that causes COVID-19 is mainly transmitted through contact with respiratory droplets rather than through the air.  See previous answer on “How does COVID-19 spread?");
        five.add("The main way the disease spreads is through respiratory droplets expelled by someone who is coughing. The risk of catching COVID-19 from someone with no symptoms at all is very low. However, many people with COVID-19 experience only mild symptoms. This is particularly true at the early stages of the disease. It is therefore possible to catch COVID-19 from someone who has, for example, just a mild cough and does not feel ill.  WHO is assessing ongoing research on the period of transmission of COVID-19 and will continue to share updated findings.");
        six.add("The risk of catching COVID-19 from the feces of an infected person appears to be low. While initial investigations suggest the virus may be present in feces in some cases, spread through this route is not a main feature of the outbreak. WHO is assessing ongoing research on the ways COVID-19 is spread and will continue to share new findings. Because this is a risk, however, it is another reason to clean hands regularly, after using the bathroom and before eating. ");
        seven.add("While we are still learning about how COVID-2019 affects people, older persons and persons with pre-existing medical conditions (such as high blood pressure, heart disease, lung disease, cancer or diabetes)  appear to develop serious illness more often than others. ");
        eight.add("No. Antibiotics do not work against viruses, they only work on bacterial infections. COVID-19 is caused by a virus, so antibiotics do not work. Antibiotics should not be used as a means of prevention or treatment of COVID-19. They should only be used as directed by a physician to treat a bacterial infection. ");
        nine.add("While some western, traditional or home remedies may provide comfort and alleviate symptoms of COVID-19, there is no evidence that current medicine can prevent or cure the disease. WHO does not recommend self-medication with any medicines, including antibiotics, as a prevention or cure for COVID-19. However, there are several ongoing clinical trials that include both western and traditional medicines. WHO will continue to provide updated information as soon as clinical findings are available.");
        ten.add("Not yet. To date, there is no vaccine and no specific antiviral medicine to prevent or treat COVID-2019. However, those affected should receive care to relieve symptoms. People with serious illness should be hospitalized. Most patients recover thanks to supportive care.\n" +
                "\n" +
                "Possible vaccines and some specific drug treatments are under investigation. They are being tested through clinical trials. WHO is coordinating efforts to develop vaccines and medicines to prevent and treat COVID-19.\n" +
                "\n" +
                "The most effective ways to protect yourself and others against COVID-19 are to frequently clean your hands, cover your cough with the bend of elbow or tissue, and maintain a distance of at least 1 meter (3 feet) from people who are coughing or sneezing. (See Basic protective measures against the new coronavirus).");
        eleven.add("No. The virus that causes COVID-19 and the one that caused the outbreak of Severe Acute Respiratory Syndrome (SARS) in 2003 are related to each other genetically, but the diseases they cause are quite different.\n" +
                "\n" +
                "SARS was more deadly but much less infectious than COVID-19. There have been no outbreaks of SARS anywhere in the world since 2003.");
        twelve.add("Only wear a mask if you are ill with COVID-19 symptoms (especially coughing) or looking after someone who may have COVID-19. Disposable face mask can only be used once. If you are not ill or looking after someone who is ill then you are wasting a mask. There is a world-wide shortage of masks, so WHO urges people to use masks wisely.\n" +
                "\n" +
                "WHO advises rational use of medical masks to avoid unnecessary wastage of precious resources and mis-use of masks  (see Advice on the use of masks).\n" +
                "\n" +
                "The most effective ways to protect yourself and others against COVID-19 are to frequently clean your hands, cover your cough with the bend of elbow or tissue and maintain a distance of at least 1 meter (3 feet) from people who are coughing or sneezing. See basic protective measures against the new coronavirus for more information.\n" +
                "\n");
        thirteen.add("The “incubation period” means the time between catching the virus and beginning to have symptoms of the disease. Most estimates of the incubation period for COVID-19 range from 1-14 days, most commonly around five days. These estimates will be updated as more data become available.");
        fourteen.add("Coronaviruses are a large family of viruses that are common in animals. Occasionally, people get infected with these viruses which may then spread to other people. For example, SARS-CoV was associated with civet cats and MERS-CoV is transmitted by dromedary camels. Possible animal sources of COVID-19 have not yet been confirmed.  \n" +
                "\n" +
                "To protect yourself, such as when visiting live animal markets, avoid direct contact with animals and surfaces in contact with animals. Ensure good food safety practices at all times. Handle raw meat, milk or animal organs with care to avoid contamination of uncooked foods and avoid consuming raw or undercooked animal products.");
        fifteen.add("While there has been one instance of a dog being infected in Hong Kong, to date, there is no evidence that a dog, cat or any pet can transmit COVID-19. COVID-19 is mainly spread through droplets produced when an infected person coughs, sneezes, or speaks. To protect yourself, clean your hands frequently and thoroughly. \n" +
                "\n" +
                "WHO continues to monitor the latest research on this and other COVID-19 topics and will update as new findings are available.");
        sixteen.add("The following measures ARE NOT effective against COVID-2019 and can be harmful:\n" +
                "\n" +
                "Smoking\n" +
                "Wearing multiple masks\n" +
                "Taking antibiotics (See question 10 \"Are there any medicines of therapies that can prevent or cure COVID-19?\")\n" +
                "In any case, if you have fever, cough and difficulty breathing seek medical care early to reduce the risk of developing a more severe infection and be sure to share your recent travel history with your health care provider.");
        seventeen.add("The first human cases of COVID-19 were identified in Wuhan City, China in December 2019. At this stage, it is not possible to determine precisely how humans in China were initially infected with SARS-CoV-2.\n" +
                "\n" +
                "However, SARS-CoV, the virus which caused the SARS outbreak in 2003, jumped from an animal reservoir (civet cats, a farmed wild animal) to humans and then spread between humans. In a similar way, it is thought that SARS-CoV-2 jumped the species barrier and initially infected humans, but more likely through an intermediate host, that is another animal species more likely to be handled by humans - this could be a domestic animal, a wild animal, or a domesticated wild animal and, as of yet, has not been identified.\n" +
                "\n" +
                "Until the source of this virus is identified and controlled, there is a risk of reintroduction of the virus in the human population and the risk of new outbreaks like the ones we are currently experiencing.");



        anser.put(question.get(0),zero);
        anser.put(question.get(1),one);
        anser.put(question.get(2),two);
        anser.put(question.get(3),three);
        anser.put(question.get(4),four);
        anser.put(question.get(5),five);
        anser.put(question.get(6),six);
        anser.put(question.get(7),seven);
        anser.put(question.get(8),eight);
        anser.put(question.get(9),nine);
        anser.put(question.get(10),ten);
        anser.put(question.get(11),eleven);
        anser.put(question.get(12),twelve);
        anser.put(question.get(13),thirteen);
        anser.put(question.get(14),fourteen);
        anser.put(question.get(15),fifteen);
        anser.put(question.get(16),sixteen);
        anser.put(question.get(17),seventeen);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.devoloper:
                Intent intent = new Intent(MyExpandableListView.this,Devoloper.class);
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.credits:
                Intent intent = new Intent(MyExpandableListView.this,Credits.class);
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.feedback:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.setPackage("com.google.android.gm");
                String[] strTo= { "sagarsk205@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,strTo);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback");
                intent.putExtra(Intent.EXTRA_TEXT,"Write your feedback");
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.share:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Give CoronaVirus a Solid Headshot by Staying Home and Win the Battle Against the Virus!!! \nTo Track COVID-19 instantly Download & Share the App from Link: https://drive.google.com/open?id=1Y8OJhihTubucD8jPLNqI4SvOFlEqoTWD\n #StayHomeStaySafe :)\n#Sk Sagar");
                sendIntent.setType("text/plain");
                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
        }
        return super.onOptionsItemSelected(item);
    }

    }

