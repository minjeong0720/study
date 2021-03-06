package a.b.c.com.member.vo;

public class MemberVO {
	
	private String mid;
	private String mpw;
	private String mname;
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	public MemberVO() {

	}
	
	public MemberVO(String mid,      String mpw,        String mname, 
			        String deleteyn,   String insertdate, String updatedate) {

		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}
	public String getMid() {
		return mid;
	}
	public String getMpw() {
		return mpw;
	}
	public String getMname() {
		return mname;
	}
	public String getDeleteyn() {
		return deleteyn;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public void setDeleteyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	@Override
	public String toString() {
		return "MemberVO [mid=" + mid + ", mpw=" + mpw + ", mname=" + mname + ", deleteyn=" + deleteyn + ", insertdate="
				+ insertdate + ", updatedate=" + updatedate + "]";
	}

	
}
