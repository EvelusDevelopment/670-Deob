import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import java.io.IOException;

final class ke {

   static int a;
   static int h;
   static ut f;
   static int j;
   static int f_i;
   static boolean b = false;
   static int g;
   static int e;
   static int c;
   static Object d;


   static final boolean a(Object[] var0, int var1, int var2) throws IOException {
      if(var1 > -30) {
         ((boolean[])((boolean[])((Object[])((Object[])var0[5]))[0]))[14] = false;
      }

      ++f_i;
      if(var0 == null) {
         throw new IllegalStateException();
      } else {
         boolean var3 = sda.a((byte)-110, (Object[])((Object[])var0[2]), var2);
         return var3;
      }
   }

   static final void a(boolean var0, int var1) {
      ++j;
      Object[] var2 = la.a(0, (long)var1, 8);
      aia.a(var2, 1);
      if(!var0) {
         a((String)null, (Object[])null, false);
      }

   }

   static final void a(String var0, Object[] var1, boolean var2) {
      ++a;
      if(ev.a((int)4120, var1)) {
         var0 = var0.toLowerCase();
         int var3 = pe.a((Object[])((Object[])((Object[])((Object[])var1[3]))[4]), var2, hp.a(var0, (int)1));
         bf.a((Object[])((Object[])var1[2]), var3, (byte)84);
      }
   }

   static final Object[] a(Object[] var0, Object[] var1, int var2) {
      ++c;
      if(var0[0] == null) {
         var0[0] = new int[7];
      }

      kv.a((byte)-105, var1, var0);
      if(var2 > -26) {
         var1[0] = (Object)null;
      }

      int var3 = lr.a(1, var1);
      ((int[])((int[])var0[0]))[6] = var3 >>> 16;
      ((int[])((int[])var0[0]))[5] = var3 & '\uffff';
      ((int[])((int[])var0[0]))[4] = fh.a(var1, false);
      return var0;
   }

   static final Object[] a(int var0, Object[] var1) throws IOException {
      try {
         if(var0 != -14100) {
            d = (Object)null;
         }

         if(null != var1 && var1.length == 7) {
            fka.a((int)-20000, (Object[])null);
         }

         ++h;
         if(((boolean[])((boolean[])var1[7]))[1]) {
            throw new IllegalStateException();
         } else if(((boolean[])((boolean[])var1[7]))[3]) {
            return null;
         } else {
            byte[] var7;
            int var9;
            while(((OggSyncState)var1[2]).pageOut((OggPage)var1[1]) <= 0) {
               byte[] var5 = (byte[])((byte[])var1[9]);
               if(var1 == null) {
                  throw new IllegalStateException();
               }

               int var6;
               label206: {
                  int var8;
                  if(var1[11] == null) {
                     if(!Class_ss.a(0, 5, (Object[])((Object[])var1[14]), ((int[])((int[])var1[12]))[1])) {
                        var6 = 0;
                        break label206;
                     }

                     if(var1 != null && var1.length == 1) {
                        era.a((Object[])null, (byte)-67);
                     }

                     var7 = qn.a(((int[])((int[])var1[12]))[1], 0, (Object[])((Object[])var1[14]), 48);
                     if(null == var7) {
                        throw new IllegalStateException("");
                     }

                     ((Object[])((Object[])var1[13]))[2] = var7;
                     ((int[])((int[])((Object[])((Object[])var1[13]))[1]))[0] = 0;
                     var8 = var7.length >> 1;
                     var1[11] = new int[var8];

                     for(var9 = 0; var9 < var8; ++var9) {
                        ((int[])((int[])var1[11]))[var9] = de.a((int)0, (Object[])((Object[])var1[13]));
                     }
                  }

                  if(((int[])((int[])var1[11])).length <= ((int[])((int[])var1[12]))[0]) {
                     var6 = -1;
                  } else {
                     fj.a(127, var1);
                     ((int[])((int[])((Object[])((Object[])var1[13]))[1]))[0] = 0;
                     ((Object[])((Object[])var1[13]))[2] = var5;

                     while(true) {
                        if(~((int[])((int[])((Object[])((Object[])var1[13]))[1]))[0] <= ~((byte[])((byte[])((Object[])((Object[])var1[13]))[2])).length) {
                           ((Object[])((Object[])var1[13]))[2] = null;
                           var6 = var5.length;
                           if(null != var1 && -6 == ~var1.length) {
                              eba.a((Object[])null, (byte)96);
                           }
                           break;
                        }

                        if(null == ((Object[])((Object[])var1[10]))[2]) {
                           if(((byte[][])((byte[][])var1[15]))[0] == null) {
                              var6 = ((int[])((int[])((Object[])((Object[])var1[13]))[1]))[0];
                              ((Object[])((Object[])var1[13]))[2] = null;
                              break;
                           }

                           ((Object[])((Object[])var1[10]))[2] = ((Object[])((Object[])var1[15]))[0];
                        }

                        int var16 = -((int[])((int[])((Object[])((Object[])var1[13]))[1]))[0] + ((byte[])((byte[])((Object[])((Object[])var1[13]))[2])).length;
                        var8 = ((byte[])((byte[])((Object[])((Object[])var1[10]))[2])).length + -((int[])((int[])((Object[])((Object[])var1[10]))[1]))[0];
                        if(var8 > var16) {
                           Class_h.a((byte)-71, var16, (Object[])((Object[])var1[10]), (byte[])((byte[])((Object[])((Object[])var1[13]))[2]), ((int[])((int[])((Object[])((Object[])var1[13]))[1]))[0]);
                           ((Object[])((Object[])var1[13]))[2] = null;
                           var6 = var5.length;
                           break;
                        }

                        lr.a(var8, (byte[])((byte[])((Object[])((Object[])var1[10]))[2]), 20244, ((int[])((int[])((Object[])((Object[])var1[10]))[1]))[0], (Object[])((Object[])var1[13]));
                        ((int[])((int[])((Object[])((Object[])var1[10]))[1]))[0] = 0;
                        ((Object[])((Object[])var1[10]))[2] = null;
                        ++((int[])((int[])var1[12]))[0];

                        for(var9 = 0; var9 < 9; ++var9) {
                           ((byte[][])((byte[][])var1[15]))[var9] = ((byte[][])((byte[][])var1[15]))[var9 + 1];
                        }

                        ((byte[][])((byte[][])var1[15]))[9] = null;
                        if(null != var1 && -2 == ~var1.length && var1[0].equals(Boolean.valueOf(false)) && var1[0].equals(Integer.valueOf(0))) {
                           return new Object[0][];
                        }

                        if(((int[])((int[])var1[12]))[0] >= ((int[])((int[])var1[11])).length) {
                           ((Object[])((Object[])var1[13]))[2] = null;
                           var6 = ((int[])((int[])((Object[])((Object[])var1[13]))[1]))[0];
                           break;
                        }
                     }
                  }
               }

               if(-1 == var6) {
                  ((boolean[])((boolean[])var1[7]))[3] = true;
                  return null;
               }

               if(0 == var6) {
                  return null;
               }

               if(!((OggSyncState)var1[2]).write((byte[])((byte[])var1[9]), var6)) {
                  throw new RuntimeException("");
               }
            }

            int var4 = ((OggPage)var1[1]).getSerialNumber();
            if(!((OggPage)var1[1]).isBOS()) {
               Class_ls var3;
               Object[] var15 = (var3 = (Class_ls)pm.a((long)var4, (Object[])((Object[])var1[4]), false)) == null?null:var3.j;
               if(((OggStreamState)var15[2]).pageIn((OggPage)var1[1])) {
                  return var15;
               } else {
                  throw new IllegalStateException();
               }
            } else {
               OggStreamState var14 = new OggStreamState(var4);
               if(!var14.pageIn((OggPage)var1[1])) {
                  throw new IllegalStateException();
               } else if(var14.packetPeek((OggPacket)var1[0]) != 1) {
                  throw new IllegalStateException();
               } else {
                  Object[] var18;
                  if(null == var1[3] && ((OggPacket)var1[0]).isTheora()) {
                     var1[3] = nk.a(new Object[13], var14, (byte)-83);
                     var18 = (Object[])((Object[])var1[3]);
                  } else if(null == var1[8] && ((OggPacket)var1[0]).isVorbis()) {
                     Object[] var20 = new Object[10];
                     lb.a(var20, 3);
                     fsa.a(0, var20, var14);
                     var20[6] = new VorbisInfo();
                     var20[8] = new VorbisComment();
                     var1[8] = var20;
                     var18 = (Object[])((Object[])var1[8]);
                  } else {
                     var7 = ((OggPacket)var1[0]).getData();
                     StringBuffer var17 = new StringBuffer();
                     if(null != var1 && 5 == var1.length && var1[4].equals(Integer.valueOf(0))) {
                        return null;
                     }

                     for(var9 = 1; var9 < var7.length && Character.isLetterOrDigit((char)var7[var9]); ++var9) {
                        var17.append((char)var7[var9]);
                     }

                     String var19 = var17.toString();
                     Object[] var11;
                     if(!var19.equals("kate")) {
                        var11 = new Object[4];
                        fsa.a(0, var11, var14);
                        var18 = var11;
                     } else {
                        var11 = new Object[7];
                        iw.a(true, var11);
                        fsa.a(0, var11, var14);
                        var18 = var11;
                     }
                  }

                  di.a((Object[])((Object[])var1[4]), true, (lm)(var18 == null?null:var18[0]), (long)var4);
                  return var18;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw vt.a(var13, "ke.C(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   static final int a(Object[] var0, int var1) {
      if(var1 != -28833) {
         a(new Object[0], (Object[])null, ((int[])((int[])var0[1]))[3]);
      }

      ++e;
      return ((int[])((int[])var0[1]))[1];
   }

   static final void a(byte var0, Object[] var1) {
      ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[8] = ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[5];
      ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[5] = ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[4];
      ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[10] = ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[2];
      ++g;
      ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[11] = ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[12];
      if(null != var1 && (var1.length == 2 || -8 == ~var1.length && var1[6].equals(Integer.valueOf(0)))) {
         a((byte)62, (Object[])null);
      }

      if(var0 == 62) {
         ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[6] = ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[8];
         ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[7] = ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[11];
         ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[2] = ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[7];
         ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[9] = ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[0];
         ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[3] = ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[9];
         if(~((int[])((int[])((Object[])((Object[])var1[0]))[0]))[10] == ~((int[])((int[])((Object[])((Object[])var1[0]))[0]))[11] && ~((int[])((int[])((Object[])((Object[])var1[0]))[0]))[9] == ~((int[])((int[])((Object[])((Object[])var1[0]))[0]))[10] && ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[8] == ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[3] && ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[6] == ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[3] && ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[5] == ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[2] && ~((int[])((int[])((Object[])((Object[])var1[0]))[0]))[2] == ~((int[])((int[])((Object[])((Object[])var1[0]))[0]))[7]) {
            ((boolean[])((boolean[])var1[3]))[0] = true;
         } else if(((boolean[])((boolean[])var1[3]))[0]) {
            ((int[])((int[])((Object[])((Object[])var1[7]))[0]))[5] = ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[5];
            ((int[])((int[])((Object[])((Object[])var1[7]))[0]))[3] = ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[3];
            ((int[])((int[])((Object[])((Object[])var1[7]))[0]))[11] = ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[11];
            ((int[])((int[])((Object[])((Object[])var1[7]))[0]))[7] = ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[7];
            ((int[])((int[])((Object[])((Object[])var1[7]))[0]))[6] = ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[6];
            ((boolean[])((boolean[])var1[3]))[0] = false;
            ((int[])((int[])((Object[])((Object[])var1[7]))[0]))[8] = ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[8];
            ((int[])((int[])((Object[])((Object[])var1[7]))[0]))[2] = ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[2];
            ((int[])((int[])((Object[])((Object[])var1[7]))[0]))[10] = ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[10];
            ((int[])((int[])((Object[])((Object[])var1[7]))[0]))[9] = ((int[])((int[])((Object[])((Object[])var1[0]))[0]))[9];
            if(var1 != null && (var1.length == 4 || 6 == var1.length)) {
               ala.a(1, (Object[])null, (ta)null, 83L);
            }
         }

      }
   }

   static {
      Object[] var0;
      f = (ut)((var0 = wj.a(new Object[1], -83)) == null?null:var0[0]);
   }
}
