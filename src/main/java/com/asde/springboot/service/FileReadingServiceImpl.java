package com.asde.springboot.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.asde.springboot.entities.VaccineData;

import org.springframework.stereotype.Service;

@Service
public class FileReadingServiceImpl implements IFileReadingService {

    private static final String fileName = "vaccinecentredata.csv";

    /**
     * TODO: implement the method to read the vaccine centre data from the provided
     * file and store it in an object as mentioned as the return type
     */
    @Override
    public VaccineData readVaccinCentreData() {
        VaccineData vd = new VaccineData();
        return vd;
    }

    /**
     * TODO: Based on the filename passed to the constructor, the method needs to be
     * implemented to get the no of slots available for the specified location and
     * vaccinetype combination e.g. the rsult shall be 50 for covaxin and gurugram
     */
    @Override
    public Integer getTotalSlotsForLocation(String location, String vaccineType) {
        String line="";
        File file = new File(fileName);
        try {
            boolean flag = false;
            FileReader fr = new FileReader(file);
            BufferedReader buffRead = new BufferedReader(fr);
            while((line = buffRead.readLine()) != null){
                String[] fData = line.split(",");
                if(flag==true){
                   if(fData[1].equals(location) && fData[0].equals(vaccineType)){
                       return new Integer(Integer.valueOf(fData[3]));
                   }
                }
                else
                flag=true;
            }
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }

    /**
	 * TODO: Implement to get the list of all vaccine centers and their relevant data
	 */
	@Override
	public List<VaccineData> readAllVaccinCentreData() {
        List<VaccineData> centerData = new ArrayList<VaccineData>();
        String line="";
        File file = new File(fileName);
        FileReader fr;
        try {
            boolean flag = false;
            fr = new FileReader(file);
            BufferedReader buffRead = new BufferedReader(fr);
            while((line = buffRead.readLine()) != null){
                String[] fData = line.split(",");
                if(flag==true){
                    VaccineData vData = new VaccineData();
                    vData.setVaccineType(fData[0]));
                    vData.setLocation(fData[1]);
                    if(fData[2].equals("true"))
                    vData.setAvailable(true);
                    else
                    vData.setAvailable(false);
                    vData.setSlots(Integer.parseInt(fData[3]);
                    centerData.add(vData);
                }
                else
                flag=true;
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return centerData;
	}

}
