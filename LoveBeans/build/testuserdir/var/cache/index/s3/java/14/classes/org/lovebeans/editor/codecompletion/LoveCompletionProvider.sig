����   2 �
  K L M N
  O
  P Q R S T S U Q V
 W X Y Z
  K [
  \
  ] ^ _ Q `
  a
  b
  c
 d e f g InnerClasses <init> ()V Code LineNumberTable LocalVariableTable this <Lorg/lovebeans/editor/codecompletion/LoveCompletionProvider; 
createTask W(ILjavax/swing/text/JTextComponent;)Lorg/netbeans/spi/editor/completion/CompletionTask; 	queryType I jtc !Ljavax/swing/text/JTextComponent; StackMapTable #org.netbeans.SourceLevelAnnotations Ljava/lang/Override; getAutoQueryTypes 6(Ljavax/swing/text/JTextComponent;Ljava/lang/String;)I string Ljava/lang/String; getRowFirstNonWhite %(Ljavax/swing/text/StyledDocument;I)I ex 'Ljavax/swing/text/BadLocationException; doc !Ljavax/swing/text/StyledDocument; offset lineElement Ljavax/swing/text/Element; start h Y 
Exceptions indexOfWhite ([C)I c C line [C i 
SourceFile LoveCompletionProvider.java 5Lorg/netbeans/api/editor/mimelookup/MimeRegistration; mimeType 	text/html service 7Lorg/netbeans/spi/editor/completion/CompletionProvider;   5org/netbeans/spi/editor/completion/CompletionProvider >org/netbeans/spi/editor/completion/support/AsyncCompletionTask <org/lovebeans/editor/codecompletion/LoveCompletionProvider$1  i  j k l m h n o p o q r s t u %javax/swing/text/BadLocationException java/lang/StringBuilder calling getText( v w v x ,  ) on doc of length:  y o z {  | } ~  � � :org/lovebeans/editor/codecompletion/LoveCompletionProvider java/lang/Object javax/swing/text/Element ?(Lorg/lovebeans/editor/codecompletion/LoveCompletionProvider;)V D(Lorg/netbeans/spi/editor/completion/support/AsyncCompletionQuery;)V javax/swing/text/StyledDocument getParagraphElement (I)Ljavax/swing/text/Element; getStartOffset ()I getEndOffset getText (II)Ljava/lang/String; java/lang/String charAt (I)C append -(Ljava/lang/String;)Ljava/lang/StringBuilder; (I)Ljava/lang/StringBuilder; 	getLength toString ()Ljava/lang/String; (Ljava/lang/String;I)V 	initCause ,(Ljava/lang/Throwable;)Ljava/lang/Throwable; java/lang/Character isWhitespace (C)Z !               3     *� �       
                ! "    # $     f     � �� Y� Y*� � �           #  $  &           ! "      % &     ' (  )     *     +    , -     @     �           P           ! "      ' (     . /  *     +    0 1         y*�  M,�  >`,� 	 � _*� 
 �  � � K� B:� Y� Y� � � � `� � *�  � � � � � ������   , 2      2    T  U  V  X , Y / ` 2 [ 4 \ Y ^ j _ q a w c     4  4 = 2 3    y 4 5     y 6 &   q 7 8   j 9 &  )    �  :B ;> <       = >     �     *�<��� *4=� � �����           g  h  i  j  k  m  n         	 ? @     A B     C &  )    �   D    E *     F  Gs H Ic J    
        