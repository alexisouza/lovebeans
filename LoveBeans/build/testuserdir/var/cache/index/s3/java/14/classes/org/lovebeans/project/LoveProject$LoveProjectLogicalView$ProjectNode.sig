����   2 r ;	  < =
  ? @ A
 B C
 D E
  F
  G	  H I
 J K
 J L
 J M
 J N
 J O P
 Q R
  S
 : T
 U V W X project #Lorg/lovebeans/project/LoveProject; this$1 LoveProjectLogicalView InnerClasses :Lorg/lovebeans/project/LoveProject$LoveProjectLogicalView; <init> x(Lorg/lovebeans/project/LoveProject$LoveProjectLogicalView;Lorg/openide/nodes/Node;Lorg/lovebeans/project/LoveProject;)V Code LineNumberTable LocalVariableTable this ProjectNode FLorg/lovebeans/project/LoveProject$LoveProjectLogicalView$ProjectNode; node Lorg/openide/nodes/Node; 
Exceptions Y 
getActions (Z)[Ljavax/swing/Action; arg0 Z #org.netbeans.SourceLevelAnnotations Ljava/lang/Override; getIcon (I)Ljava/awt/Image; type I getOpenedIcon getDisplayName ()Ljava/lang/String; 
SourceFile LoveProject.java Z 8org/lovebeans/project/LoveProject$LoveProjectLogicalView   %org/openide/nodes/FilterNode$Children Children  [ #org/openide/util/lookup/ProxyLookup org/openide/util/Lookup \ ] ^ _ ` a  b  c   javax/swing/Action d e f g f h f i f j f org/lovebeans/project/icon.png k l m 1 2 n o p q 7 Dorg/lovebeans/project/LoveProject$LoveProjectLogicalView$ProjectNode org/openide/nodes/FilterNode /org/openide/loaders/DataObjectNotFoundException !org/lovebeans/project/LoveProject (Lorg/openide/nodes/Node;)V org/openide/util/lookup/Lookups 	singleton -(Ljava/lang/Object;)Lorg/openide/util/Lookup; org/openide/nodes/Node 	getLookup ()Lorg/openide/util/Lookup; ([Lorg/openide/util/Lookup;)V P(Lorg/openide/nodes/Node;Lorg/openide/nodes/Children;Lorg/openide/util/Lookup;)V 8org/netbeans/spi/project/ui/support/CommonProjectActions newFileAction ()Ljavax/swing/Action; copyProjectAction deleteProjectAction customizeProjectAction closeProjectAction org/openide/util/ImageUtilities 	loadImage $(Ljava/lang/String;)Ljava/awt/Image; getProjectDirectory &()Lorg/openide/filesystems/FileObject; "org/openide/filesystems/FileObject getName 0                     !   � 	    1*+� *,� Y,� � Y� Y-� SY,� S� 	� 
*-� �    "       �  �  � ! � ( � + � 0 � #        1 $ &     1 ' (    1    )     *  + ,  !   k     #� Y� SY� SY� SY� SY� S�    "       �  �  �  �  �  � #       # $ &     # - .  /     0    1 2  !   :     � �    "       � #        $ &      3 4  /     0    5 2  !   :     *� �    "       � #        $ &      3 4  /     0    6 7  !   5     *� � � �    "       � #        $ &   /     0    8    9       :      %    > 	