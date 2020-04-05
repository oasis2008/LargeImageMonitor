package org.zzy.lib.largeimage;

/**
 * ================================================
 * 作    者：ZhouZhengyi
 * 创建日期：2020/4/4 8:09
 * 描    述：大图的信息
 * 修订历史：
 * ================================================
 */
public class LargeImageInfo {

    /**
     * 图片地址
     */
    private String url;

    /**
     * 图片文件大小
     */
    private double fileSize;

    /**
     * 图片所占内存大小
     */
    private double memorySize;

    /**
     * 图片宽
     */
    private int width;

    /**
     * 图片高
     */
    private int height;

    /**
     * 加载图片所使用的框架
     */
    private String framework;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}