package cc.ryanc.halo.model.entity.enums;

/**
 * Attach origin.
 *
 * @author : RYAN0UP
 * @date : 2019-03-12
 */
public enum AttachOrigin implements ValueEnum<Integer> {

    /**
     * 服务器
     */
    SERVER(0),

    /**
     * 又拍云
     */
    UPYUN(1),

    /**
     * 七牛云
     */
    QINIUYUN(2);

    private Integer value;

    AttachOrigin(Integer value) {
        this.value = value;
    }

    /**
     * Get enum value.
     *
     * @return enum value
     */
    @Override
    public Integer getValue() {
        return value;
    }
}
