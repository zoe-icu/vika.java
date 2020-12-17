package cn.vika.client.datasheet.model;

import java.util.HashMap;

import cn.vika.api.model.AbstractModel;

/**
 * record page response info
 *
 * @author Zoe Zheng
 * @date 2020-12-16 14:10:31
 */
public class RecordPageInfo extends AbstractModel {
    /**
     * page number
     */
    private Integer pageNum;

    private Integer pageSize;

    private Integer total;

    private RecordInfo[] records;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public RecordInfo[] getRecords() {
        return records;
    }

    public void setRecords(RecordInfo[] records) {
        this.records = records;
    }

    /**
     * request query param to map
     *
     * @param map
     */
    @Override
    public void toMap(HashMap<String, String> map, String prefix) {

    }
}