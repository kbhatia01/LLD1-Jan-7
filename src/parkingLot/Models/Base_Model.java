
  package Models;
  import java.util.Date;
  public class Base_Model {
    private int id;
    private Date createdAt;
    private Date updatedAt;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public Date getCreatedAt() {
      return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
      this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
      return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
    }
  }
