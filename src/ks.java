import jaclib.memory.Buffer;
import jagdx.IDirect3DDevice;
import jagdx.fna;
import jaggl.OpenGL;

final class ks {

   static int d;
   static int c;
   static int e;
   static int f;
   static int g;
   static int a;
   static int h;
   static int b;


   static final void a(byte var0, Object[] var1) {
      ++f;
      if(var0 <= -126) {
         var1[19] = new float[3];
      }
   }

   static final void a(int var0, int var1) {
      jta.a = new int[var1];
      qv.a = new int[var1];
      tp.m = new int[var1];
      if(var0 != 0) {
         c = 98;
      }

      dua.a = new int[var1];
      ++d;
      dg.c = new int[var1];
   }

   static final boolean a(int var0, Object[] var1, long var2, byte var4) {
      if(var4 >= -12) {
         return true;
      } else {
         ++g;
         return fna.a(IDirect3DDevice.SetRenderTarget(((long[])((long[])((Object[])((Object[])var1[2]))[50]))[5], var0, var2), (byte)127);
      }
   }

   static final int[][] a(Object[] var0, byte var1, int var2) {
      ++h;
      if(var1 < 58) {
         return (int[][])((int[][])null);
      } else {
         int[][] var3 = loa.a((byte)-52, var2, (Object[])((Object[])var0[4]));
         if(((boolean[])((boolean[])((Object[])((Object[])var0[4]))[0]))[0]) {
            int[][] var4 = bsa.a(0, (byte)17, !((boolean[])((boolean[])var0[3]))[2]?var2:wq.e + -var2, var0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            int var11;
            if(!((boolean[])((boolean[])var0[3]))[1]) {
               if(null != var0 && (-2 == ~var0.length && var0[0].equals(Boolean.valueOf(false)) && var0[0].equals(Integer.valueOf(2)) || var0.length == 3)) {
                  cja.a(25, -27, (Object[])null);
               }

               for(var11 = 0; var11 < fo.b; ++var11) {
                  var8[var11] = var5[var11];
                  var9[var11] = var6[var11];
                  var10[var11] = var7[var11];
               }
            } else {
               if(var0 != null && -2 == ~var0.length) {
                  return (int[][])null;
               }

               for(var11 = 0; fo.b > var11; ++var11) {
                  var8[var11] = var5[-var11 + td.q];
                  var9[var11] = var6[-var11 + td.q];
                  var10[var11] = var7[td.q + -var11];
               }
            }
         }

         return var3;
      }
   }

   static final Object[] a(int var0, Object[] var1, int var2, Object[] var3) {
      ++b;
      if(var2 != 10791) {
         c = ((int[])((int[])var3[9]))[1];
      }

      lra.a(var3, 16830, var0, var1);
      return var3;
   }

   static final Object[] a(Object[] var0, int var1, Buffer var2, Object[] var3, boolean var4, int var5, byte var6) {
      ++e;
      if(null == var3[1]) {
         var3[1] = new int[4];
      }

      if(var6 != 33) {
         return (Object[])null;
      } else {
         if(var3[1] == null) {
            var3[1] = new int[3];
         }

         if(null == var3[3]) {
            var3[3] = new boolean[2];
         }

         wea.c(-6574, var3);
         var3[0] = oc.b(var3, (byte)24);
         ((int[])((int[])var3[1]))[2] = '\u8892';
         ((boolean[])((boolean[])var3[3]))[0] = var4;
         ((int[])((int[])var3[1]))[0] = var1;
         var3[2] = var0;
         OpenGL.glGenBuffersARB(1, mda.d, 0);
         ((int[])((int[])var3[1]))[1] = mda.d[0];
         lta.b(var6 - 32389, var3);
         OpenGL.glBufferDataARBa('\u8892', ((int[])((int[])var3[1]))[0], var2.b(), ((boolean[])((boolean[])var3[3]))[0]?'\u88e0':'\u88e4');
         ((int[])((int[])((Object[])((Object[])var3[2]))[1]))[19] += ((int[])((int[])var3[1]))[0];
         ((int[])((int[])var3[1]))[3] = var5;
         return var3;
      }
   }

   static final boolean a(Object[] var0, boolean var1) {
      ++a;
      if(se.a((Object[])((Object[])var0[0]), (byte)-122)) {
         return false;
      } else {
         if(var1) {
            a((byte)22, (Object[])null);
         }

         return fca.a(107, (Object[])((Object[])var0[0])) == uha.g;
      }
   }

}
