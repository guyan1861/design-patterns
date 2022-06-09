package com.thinking.in.design.pattern.struct.decorator.example.decorators;

/**
 * 基础的装饰者类
 */
public class DataSourceDecorator implements DataSource {
    private DataSource wrapper;

    public DataSourceDecorator(DataSource wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
