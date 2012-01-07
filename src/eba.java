import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

final class eba {

   static Object[] a = a(3, vk.h, 25298, new Object[2], 0);
   static int q;
   static int o;
   static int f_i;
   static int f;
   static int j;
   static int n;
   static int p;
   static Object[] h = a(3, vk.h, 25298, new Object[2], 1);
   static Object[] d = a(4, vk.f, 25298, new Object[2], 2);
   static int g;
   static Object[] k = a(1, vk.h, 25298, new Object[2], 3);
   static Object[] e = a(2, vk.h, 25298, new Object[2], 4);
   static Object[] m = a(3, vk.h, 25298, new Object[2], 5);
   static Object[] c = a(4, vk.h, 25298, new Object[2], 6);
   static int b;
   static vp f_l;


   private static final Object[] a(int var0, Object[] var1, int var2, Object[] var3, int var4) {
      try {
         if(var2 != 25298) {
            return (Object[])null;
         } else {
            if(null == var3[1]) {
               var3[1] = new int[3];
            }

            ++f_i;
            var3[0] = var1;
            ((int[])((int[])var3[1]))[0] = var4;
            ((int[])((int[])var3[1]))[1] = var0;
            ((int[])((int[])var3[1]))[2] = ((int[])((int[])var3[1]))[1] * ((int[])((int[])((Object[])((Object[])var3[0]))[0]))[1];
            if(16 > ((int[])((int[])var3[1]))[0]) {
               return var3;
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var6) {
         throw vt.a(var6, "eba.D(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ')');
      }
   }

   static final Object[] a(int var0, Object[] var1, byte var2) {
      ++n;
      fb.a(var1, (byte)-40);
      cva var4 = new cva(var1);
      if(var2 != -74) {
         a(-67, (Object[])((Object[])h[2]), ((byte[])((byte[])h[5]))[17]);
      }

      var1[0] = var4;
      ((int[])((int[])var1[1]))[0] = var0;
      return var1;
   }

   static final void b(Object[] var0, int var1) {
      if(var1 < 62) {
         b((Object[])((Object[])d[2]), ((int[])((int[])var0[1]))[1]);
      }

      ++p;
      if(null == var0) {
         throw new IllegalStateException();
      } else {
         psa.a(var0, (byte)-11);
      }
   }

   static final Object[] a(int var0, int var1, byte[] var2, boolean var3, int var4, Object[] var5, Object[] var6, Object[] var7, Object[] var8, Object[] var9, int var10) {
      label11: {
         ++g;
         ne.a(var7, -117);
         wqa.a(var7, var6, var5, var9, true, var0 + 0, var10, var1, var3, var4, var2, var8);
         ((int[])((int[])var7[1]))[5] = var1;
         ((int[])((int[])var7[var0]))[6] = var4;
         if(-34038 == ~((int[])((int[])var7[1]))[2]) {
            ((float[])((float[])var7[6]))[1] = (float)var1;
            ((boolean[])((boolean[])var7[3]))[3] = false;
            ((float[])((float[])var7[6]))[0] = (float)var4;
            if(client.f_vb == 0) {
               break label11;
            }
         }

         ((boolean[])((boolean[])var7[3]))[3] = true;
         ((float[])((float[])var7[6]))[0] = 1.0F;
         ((float[])((float[])var7[6]))[1] = 1.0F;
      }

      ((boolean[])((boolean[])var7[3]))[2] = false;
      return var7;
   }

   static final Object[] a(int var0, int var1) {
      ++q;
      if(var0 >= -96) {
         e = (Object[])((Object[])e[0]);
      }

      return 5 != var1?(4 == var1?e:(3 != var1?(1 == var1?h:(2 != var1?(6 == var1?c:(0 != var1?null:a)):d)):k)):m;
   }

   static final void a(int var0, int var1, int var2, int var3) {
      Object[] var4 = ju.g[var0][var1][var2];
      if(var4 != null) {
         Object[] var5 = (Object[])((Object[])var4[8]);
         Object[] var6 = (Object[])((Object[])var4[0]);
         if(var5 != null) {
            ((short[])((short[])var5[13]))[0] = (short)(((short[])((short[])var5[13]))[0] * var3 / (16 << qqa.e - 7));
            ((short[])((short[])var5[13]))[1] = (short)(((short[])((short[])var5[13]))[1] * var3 / (16 << qqa.e - 7));
         }

         if(var6 != null) {
            ((short[])((short[])var6[13]))[0] = (short)(((short[])((short[])var6[13]))[0] * var3 / (16 << qqa.e - 7));
            ((short[])((short[])var6[13]))[1] = (short)(((short[])((short[])var6[13]))[1] * var3 / (16 << qqa.e - 7));
         }

      }
   }

   static final void a(Object[] var0, byte var1) {
      ++o;
      if(var1 >= 91) {
         Class_ls var2;
         Class_ls var3;
         for(Object[] var4 = (var2 = (Class_ls)qt.a(0, (Object[])((Object[])var0[4]))) == null?null:var2.j; var4 != null; var4 = (var3 = (Class_ls)nda.a(1, (Object[])((Object[])var0[4]))) != null?var3.j:null) {
            if(var4 != null && -25 == ~var4.length) {
               era.a(new Object[29][], (byte)-67);
            }

            if(null != var4 && var4.length == 7) {
               Object[] var5 = var4;

               while(true) {
                  if(((int[])((int[])var5[1]))[0] > 8) {
                     double var6 = ae.a(-2, var0);
                     float var8 = ((float[])((float[])var5[5]))[0];
                     if(var6 <= (double)var8) {
                        break;
                     }
                  }

                  if(1 != ((OggStreamState)var5[2]).packetOut((OggPacket)var0[0])) {
                     break;
                  }

                  qk.a(1, var5, (OggPacket)var0[0]);
               }
            }
         }

         wha.a((String)var0[5], 5, var0);
         if(var0 == null || -12 != ~var0.length) {
            ;
         }
      }
   }

   static final dga a(byte var0, Object[] var1) {
      ++f;
      return var0 != -18?(dga)null:new dga(var1);
   }

   static final void a(Object[] var0, int var1) {
      if(var0[1] == null) {
         var0[1] = new int[4];
      }

      ++j;
      if(var1 != 4) {
         a((byte)-55, new Object[1]);
      }

   }

   static {
      a(4, vk.h, 25298, new Object[2], 7);
      a(4, vk.h, 25298, new Object[2], 8);
      a(4, vk.h, 25298, new Object[2], 9);
      a(3, vk.h, 25298, new Object[2], 10);
      a(3, vk.h, 25298, new Object[2], 11);
      b = dba.a(16, 110);
   }
}
