package ru.netology.domain;

public class Post {
    private int postID;
    private int ownerID;
    private int autorID;
    private int createdByID;
    private String avatarURL;
    private String name;
    private int data;
    private String text;
    private String imageURL;
    private boolean friendsOnly;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;
    private GeoInfo geoInfo;
    private boolean canEdit;
    private boolean canDelete;
    private int viewing;
}
