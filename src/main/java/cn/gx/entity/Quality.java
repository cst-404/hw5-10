package cn.gx.entity;

public class Quality {
    private Long id;
    private Integer score;
    private String qualityDesc;
    private Long productId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getQualityDesc() {
        return qualityDesc;
    }

    public void setQualityDesc(String qualityDesc) {
        this.qualityDesc = qualityDesc;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Quality{" +
                "id=" + id +
                ", score=" + score +
                ", qualityDesc='" + qualityDesc + '\'' +
                ", productId=" + productId +
                '}';
    }
}
