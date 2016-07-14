package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Sergey Shilkin on 21.06.2016.
 */
public class CrimeLab {

    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;

    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public void addCrime(Crime c){
        mCrimes.add(c);
    }

    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
        /*for (int i = 0; i<100; i++){
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i%2==0);
            mCrimes.add(crime);
        }*/
    }

    public List<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for (Crime crime : mCrimes){
            if(crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }

    public int getPosition(UUID id){
        int i=0;
        for (Crime crime : mCrimes){
            if(crime.getId().equals(id)){
                return i;
            }
            i++;
        }
        return -1;
    }
}
