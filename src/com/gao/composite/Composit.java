package com.gao.composite;

/**
 * 容器
 */
public interface Composit extends Component {
    void add(Component c);

    void remove(Component c);

    Component getChild(int index);
}
