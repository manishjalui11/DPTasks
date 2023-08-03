package solid.live.srp;

public class EmploeeInfo {


    public String toHtml(Employee employee) {

        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpId() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (employee.getTotalLeaveAllowed() - employee.getLeavesTaken()) + "</span>";
        str += "<span>" + employee.getAnnualSalary() + "</span>";
        str += "<span>" + employee.getManager() + "</span>";
        str += "<span>" + employee.calcTotalLeaveLeftPreviously() + "</span>";
        return str + "</div> </div>";
    }
}
