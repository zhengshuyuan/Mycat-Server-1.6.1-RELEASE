package io.mycat.config.loader.zkprocess.comm;

/**
 * 当前zk的配制参数信息 源文件名：ZkParamCfg.java 文件版本：1.0.0 创建作者：liujun 创建日期：2016年9月17日
 * 修改作者：liujun 修改日期：2016年9月17日 文件描述：TODO 版权所有：Copyright 2016 zjhz, Inc. All
 * Rights Reserved.
 */
public enum ZkParamCfg {

    /**
     * zk是否启用标识
     * 
     * @字段说明 ZK_CFG_OPEN
     */
    ZK_CFG_FLAG("loadZk"),
    /**
     * zk节点鉴权的id0
     * 
     * @字段说明 ACL_ID0
     */
    ACL_ID0("aclId0"),
    /**
     * zk节点鉴权的id1
     * 
     * @字段说明 ZK_CFG_OPEN
     */
    ACL_ID1("aclId1"),
    /**
     * 节点权重
     * 
     * @字段说明 NODE_WEIGHT
     */
    NODE_WEIGHT("weight"),

    /**
     * 是否在zk上注册的标识
     * 
     * @字段说明 ZK_REG_FLAG
     */
    ZK_REG_FLAG("registZk"),
    /**
     * zk上注册的节点的名字
     * 
     * @字段说明 ZK_REG_NAME
     */
    ZK_REG_NAME("registNode"),
    /**
     * zk上client节点挂载的节点
     * 
     * @字段说明 ZK_REG_NAME
     */
    ZK_CLIENT_NODE("clientNode"),
    /**
     * 节点的ip串
     * 
     * @字段说明 NODE_IP_STRING
     */
    NODE_IP_STRING("ipString"),
    /**
     * 获取ip的网卡的名字
     * 
     * @字段说明 ZK_NETWORK_NAME
     */
    ZK_NETWORK_NAME("networkName"),

    /**
     * zk配制的url地址信息
     * 
     * @字段说明 ZK_CFG_URL
     */
    ZK_CFG_URL("zkURL"),

    /**
     * 集群的id
     * 
     * @字段说明 ZK_CFG_CLUSTERID
     */
    ZK_CFG_CLUSTERID("clusterId"),

    /**
     * 当前mycat节点的id
     * 
     * @字段说明 zk_CFG_MYID
     */
    ZK_CFG_MYID("myid"),

    /**
     * 集群中所有节点的名称信息
     * 
     * @字段说明 ZK_CFG_CLUSTER_NODES
     */
    ZK_CFG_CLUSTER_NODES("clusterNodes"),

    /**
     * 集群中所有节点的名称信息的分隔符
     * 
     * @字段说明 ZK_CFG_CLUSTER_NODES
     */
    ZK_CFG_CLUSTER_NODES_SEPARATE(","),

    ;

    private ZkParamCfg(String key) {
        this.key = key;
    }

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
