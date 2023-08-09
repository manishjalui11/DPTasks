package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class ThirdPartyLeaveRecordAdaptor implements LeaveRecord{

    ThirdPartyLeaveRecord thirdPartyLeaverecord;

    ThirdPartyLeaveRecordAdaptor(ThirdPartyLeaveRecord thirdPartyLeaveRecord){
        this.thirdPartyLeaverecord= thirdPartyLeaveRecord;
    }

    @Override
    public String getMostAbsentEmployee() {
        return thirdPartyLeaverecord.getMostAbsentEmployee().getName();
    }

    @Override
    public int getEmployeeAbsences(String employeeName) {
//        Employee employee = new Employee(employeeName);
//        return thirdPartyLeaverecord.getEmployeeAbsences(employee);
        return 0;
    }
}
