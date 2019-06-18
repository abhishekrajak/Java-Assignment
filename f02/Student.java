class Student{
	private String name;
	private float subject_01;
	private float subject_02;
	private float subject_03;
	
	public Student(){
                this("NULL", 0, 0, 0);
        }
	public Student(final String name){
		this(name, 0, 0, 0);
	}
	public Student(final String name, final float sub_01, final float sub_02, final float sub_03){
                this.name = name;
                subject_01 = sub_01;
                subject_02 = sub_02;
                subject_03 = sub_03;
        }
	public void setName(final String name){
		this.name = name;
	}
	public void setSubject_01(final float sub_01){
		subject_01 = sub_01;
	}
	public void setSubject_02(final float sub_02){
		subject_02 = sub_02;
	}
	public void setSubject_03(final float sub_03){
		subject_03 = sub_03;
	}
	public float getSubject_01(){
		return subject_01;
	}
	public float getSubject_02(){
                return subject_02;
        }
	public float getSubject_03(){
                return subject_03;
        }
	public float getTotal(){
		return (subject_01+subject_02+subject_03);
	}
	public float getAverage(){
		return getTotal()/3;
	}
	public void display(){
		System.out.println("Student Name : " + name);
		System.out.println("Average Marks : " + getAverage());
	}
}
