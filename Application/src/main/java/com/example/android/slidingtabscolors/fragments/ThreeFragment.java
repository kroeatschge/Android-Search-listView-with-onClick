package com.example.android.slidingtabscolors.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.android.slidingtabscolors.R;
import com.example.android.slidingtabscolors.activity.HelloActivity;

import java.util.ArrayList;
import java.util.HashMap;


public class ThreeFragment extends Fragment{

    // List view
    private ListView lv;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;


    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;
    public ThreeFragment() {
        // Required empty public constructor
    }

    String[] FemaleSinger = {"Alisha Chinai",
            "Alka Ajith",
            "Alka Yagnik",
            "Amika Shail",
            "Amirbai Karnataki",
            "Andrea Jeremiah",
            "Anupama",
            "Anupama Deshpande",
            "Anuradha Bhat",
            "Anuradha Paudwal",
            "Anuradha Sriram",
            "Anushka Manchanda",
            "Aarti Mukherji",
            "Asha Bhosle",
            "Banumathi",
            "Bhavatharini",
            "B. R. Chaya",
            "Bela Shende",
            "Bombay Jayashri",
            "Charulatha Mani",
            "Chinmayi",
            "Chitra Singh",
            "Deepa Miriam",
            "Dominique Cerejo",
            "Falguni Pathak",
            "Gayatri Asokanv",
            "Gayatri Iyer (Gayatri Ganjawala)",
            "Geeta Dutt",
            "Geeta Madhuri",
            "Harshdeep Kaur",
            "Hard Kaurv",
            "Harini",
            "Harini Ravi",
            "Hema Sardesai",
            "Hemlata",
            "Ila Arun",
            "Jaspinder Narula",
            "Jency Anthony",
            "Jikki",
            "Jonita Gandhi",
            "Jyotsna Radhakrishnan",
            "Kanika Kapoor",
            "Kanan Devi",
            "Kavita Subramaniam (Kavita Krishnamurthy)",
            "K. S. Chithra (referred to as Chitra)",
            "Lata Mangeshkar",
            "L. R. Eswari",
            "Madhushree",
            "Mahalaxmi Iyer",
            "Mahathi",
            "Malgudi Subha",
            "Mamta Sharma",
            "Manjari",
            "Megha",
            "Minmini",
            "Monali Thakur",
            "Mubarak Begum",
            "Nanditha",
            "Neeti Mohan",
            "Neha Kakkar",
            "Neha Rajpal (Nehha Rajpal) née 'Chandna' ",
            "Nihira Joshi",
            "Nithyasree Mahadevan",
            "P. Leela",
            "P. Madhuri",
            "P. Susheela",
            "Palak Muchhal",
            "Pop Shalini (Shalini Singh)",
            "Prashanthini",
            "Priya Himesh",
            "Priyadarshini",
            "Rajkumari",
            "Ramakrishna V.",
            "Reena Bhardwaj",
            "Rekha Bhardwaj",
            "Richa Sharma",
            "Roopa Revathi",
            "Ruma Guha Thakurta",
            "S. Janaki",
            "S. P. Sailaja",
            "Sadhana Sargam",
            "Sandhya Mukherjee",
            "Sanjivani",
            "(Sanjeevani Bhelande)",
            "Santha P. Nair",
            "Saindhavi",
            "Shamshad Begum",
            "Sapna Mukherjee",
            "Shalmali Kholgade",
            "Shamshad Begum",
            "Sharda Rajan Iyengar",
            "Shashaa Tirupati",
            "Shazneen Arethna",
            "Shilpa Rao",
            "Sharda Sinha",
            "Shreya Ghoshal",
            "Shruti Pathak",
            "Shweta Mohan",
            "Shweta Pandit",
            "Sithara",
            "Sona Mohapatra",
            "Sonu Kakkar",
            "Sowmya Raoh",
            "Srilekha Parthasarathy",
            "Sudha Malhotra",
            "Sujatha",
            "Sulakshana Pandit",
            "Suman Kalyanpur",
            "Sunitha Sarathy",
            "Sunitha Upadrashta",
            "Sushma Shrestha",
            "Sunidhi Chauhan",
            "Suraiya",
            "Suvi Suresh",
            "Suzanne D'Mello",
            "Swarnalatha",
            "Tanvi Shah",
            "Tulsi Kumar",
            "Usha",
            "Usha Khanna",
            "Usha Mangeshkar",
            "Usha Uthup",
            "Vaishali Samant",
            "Vandana Srinivasan",
            "Vani Jairam",
            "Vasundhara Das"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        // Listview Data

        lv = (ListView) rootView.findViewById(R.id.list_view);
        inputSearch = (EditText) rootView.findViewById(R.id.inputSearch);

        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                ThreeFragment.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, FemaleSinger);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });


    }
}
