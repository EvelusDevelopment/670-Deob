import jaclib.memory.Source;
import jaclib.memory.Stream;
import jagdx.D3DLIGHT;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import jaggl.OpenGL;

final class el {

   static int g;
   static int c;
   static int d;
   static int f_i;
   static int f;
   static int e;
   static int h;
   static int b;
   static int a;


   static final String a(int var0, int var1) {
      ++b;
      return var1 != 0?(String)null:"<col=" + Integer.toHexString(var0) + ">";
   }

   static final void a(int var0, boolean var1, int var2, int var3, Object[] var4, int var5, int var6) {
      ((byte[])((byte[])var4[10]))[0] = ((byte[])((byte[])var4[10]))[1] = (byte)var0;
      ++c;
      if(fr.a(var3, var5, (byte)51)) {
         ++((byte[])((byte[])var4[10]))[1];
      }

      if(wna.a((Object[])((Object[])var4[25]), 4) && -2 == ~((int[])((int[])nc.a(false, (Object[])((Object[])var4[25]))[1]))[2]) {
         var4[31] = null;
         rs.a(-1, (Object[])((Object[])var4[25]), 124);
      }

      if(var2 > 101) {
         int var7;
         for(var7 = 0; ((Object[])((Object[])var4[18])).length > var7; ++var7) {
            if(((int[])((int[])((Object[][])((Object[][])var4[18]))[var7][1]))[1] != -1) {
               Object[] var8 = qda.a(((int[])((int[])((Object[][])((Object[][])var4[18]))[var7][1]))[1], (byte)-64, dfa.a);
               if(((boolean[])((boolean[])var8[6]))[0] && -1 != ((int[])((int[])var8[1]))[4] && ((int[])((int[])bs.a(he.b, -15, ((int[])((int[])var8[1]))[4])[1]))[2] == 1) {
                  rs.a(-1, (Object[])((Object[])((Object[][])((Object[][])var4[18]))[var7][0]), 118);
                  ((int[])((int[])((Object[][])((Object[][])var4[18]))[var7][1]))[1] = -1;
               }
            }
         }

         if(!var1) {
            var7 = var5 + -((int[])((int[])var4[33]))[0];
            int var11 = var3 - ((int[])((int[])var4[14]))[0];
            if(-8 <= var7 && var7 <= 8 && -8 <= var11 && var11 <= 8) {
               if(var4 != null && var4.length == 1 && var4[0].equals(Integer.valueOf(2))) {
                  return;
               }

               if(((int[])((int[])var4[12]))[18] < -1 + ((int[])((int[])var4[33])).length) {
                  ++((int[])((int[])var4[12]))[18];
               }

               for(int var9 = ((int[])((int[])var4[12]))[18]; 0 < var9; --var9) {
                  ((int[])((int[])var4[33]))[var9] = ((int[])((int[])var4[33]))[var9 - 1];
                  ((int[])((int[])var4[14]))[var9] = ((int[])((int[])var4[14]))[var9 - 1];
                  ((byte[])((byte[])var4[22]))[var9] = ((byte[])((byte[])var4[22]))[-1 + var9];
               }

               ((int[])((int[])var4[33]))[0] = var5;
               ((int[])((int[])var4[14]))[0] = var3;
               ((byte[])((byte[])var4[22]))[0] = 1;
               return;
            }
         }

         ((int[])((int[])var4[33]))[0] = var5;
         ((int[])((int[])var4[12]))[18] = 0;
         ((int[])((int[])var4[12]))[20] = 0;
         ((int[])((int[])var4[12]))[12] = 0;
         ((int[])((int[])var4[14]))[0] = var3;
         Object[] var10 = mha.a((byte)123, new Object[2], (Object[])((Object[])woa.a(5, var4)[1]));
         ((float[])((float[])var10[1]))[2] = (float)((((int[])((int[])var4[33]))[0] << 9) + (var6 << 8));
         ((float[])((float[])var10[1]))[1] = (float)((((int[])((int[])var4[14]))[0] << 9) + (var6 << 8));
         sra.a(var4, var10, 1);
         if(null != var4[16]) {
            ((ch)var4[16]).e();
         }

      }
   }

   static final void a(boolean var0, int var1, Object[] var2) {
      ++f_i;
      ((Stream)var2[6]).b();
      var2[7] = mc.a(-118, (Object[])((Object[])var2[8]), var0);
      pha.a(4 * var1, 0, (Source)var2[2], (Object[])((Object[])var2[7]), 4);
      var2[2] = null;
      var2[6] = null;
   }

   static final void a(int var0, int var1, int var2, Object[] var3) {
      if(var1 != 30862) {
         a(-61, 30, -22, (Object[])((Object[])var3[4]));
      }

      ++h;
      if(0 != ((int[])((int[])var3[1]))[6]) {
         OpenGL.glTexEnvi(8960, '\u8571', var2);
         OpenGL.glTexEnvi(8960, '\u8572', var0);
      } else {
         boolean var4 = false;
         if(~var2 != ~((int[])((int[])var3[1]))[38]) {
            OpenGL.glTexEnvi(8960, '\u8571', var2);
            ((int[])((int[])var3[1]))[38] = var2;
            var4 = true;
         }

         if(((int[])((int[])var3[1]))[16] != var0) {
            OpenGL.glTexEnvi(8960, '\u8572', var0);
            var4 = true;
            ((int[])((int[])var3[1]))[16] = var0;
         }

         if(var4) {
            ((int[])((int[])var3[1]))[20] &= -14;
         }
      }

   }

   static final void a(Object[] var0, int var1, long var2) {
      ++a;
      int var4 = 39 / ((0 - var1) / 41);
      synchronized(var0) {
         if(~((int[])((int[])var0[1]))[40] == ~((int[])((int[])var0[1]))[42]) {
            ((int[])((int[])var0[1]))[42] *= 2;
            long[] var6 = new long[((int[])((int[])var0[1]))[42]];
            System.arraycopy(var0[74], 0, var6, 0, ((int[])((int[])var0[1]))[40]);
            var0[74] = var6;
         }

         ((long[])((long[])var0[74]))[((int[])((int[])var0[1]))[40]] = var2;
         ++((int[])((int[])var0[1]))[40];
      }
   }

   static final Object[] a(boolean var0, Object[] var1, Object[] var2) {
      if(var2[1] == null) {
         var2[1] = new int[5];
      }

      var2[4] = new Object[4][];
      ++e;
      tka var4 = new tka(var2);
      var2[3] = var4;
      if(((boolean[])((boolean[])var1[17]))[0]) {
         if(!var0) {
            return (Object[])null;
         } else {
            var2[2] = var1;
            int[] var5 = new int[1];
            OpenGL.glGenFramebuffersEXT(1, var5, 0);
            ((int[])((int[])var2[1]))[4] = var5[0];
            return var2;
         }
      } else {
         throw new IllegalStateException("");
      }
   }

   static final void a(Object[] var0, byte var1) {
      ++d;
      if(~((long[])((long[])var0[50]))[3] != -1L) {
         D3DLIGHT.Destroy(((long[])((long[])var0[50]))[3]);
         ((long[])((long[])var0[50]))[3] = 0L;
      }

      if(var1 <= 7) {
         ((long[])((long[])var0[0]))[3] = -49L;
      }

      if(~((long[])((long[])var0[50]))[2] != -1L) {
         D3DLIGHT.Destroy(((long[])((long[])var0[50]))[2]);
         ((long[])((long[])var0[50]))[2] = 0L;
      }

      if(0L != ((long[])((long[])var0[50]))[4]) {
         D3DLIGHT.Destroy(((long[])((long[])var0[50]))[4]);
         ((long[])((long[])var0[50]))[4] = 0L;
      }

      if(~((long[])((long[])var0[50]))[5] != -1L) {
         IDirect3DDevice.Destroy(((long[])((long[])var0[50]))[5]);
         ((long[])((long[])var0[50]))[5] = 0L;
      }

      if(0L != ((long[])((long[])var0[50]))[6]) {
         IUnknown.Release(((long[])((long[])var0[50]))[6]);
         ((long[])((long[])var0[50]))[6] = 0L;
      }

      rs.b(2, var0);
   }

   static final void a(int var0, Object[] var1) {
      if(var0 > 74) {
         ++g;
         if(bga.f != var1[24]) {
            Object[] var2 = (Object[])((Object[])var1[24]);
            var1[24] = bga.f;
            if(var2 == bsa.b) {
               uda.a((int)24796, var1);
            }

            io.a(var1, (int)43);
            var1[29] = var1[66];
            gpa.a(var1, (int)7);
            loa.b((byte)-104, var1);
            ((int[])((int[])var1[1]))[23] &= -9;
         }

      }
   }

   static final void a(int var0, int var1, boolean var2, int var3, int var4, Object[] var5) {
      ++f;
      if(var2) {
         if(var5[2] != null) {
            int var6 = -1 + var3 >> 7;
            int var7 = var4 + -1 + (var3 - 1) >> 7;
            int var8 = -1 + var1 >> 7;
            int var9 = -1 + var0 + -1 + var1 >> 7;

            for(int var10 = var6; var10 <= var7; ++var10) {
               Object[][] var11 = ((Object[][][])((Object[][][])var5[2]))[var10];
               if(null != var5 && 37 == var5.length && var5[15].equals(Integer.valueOf(2)) && var5[15].equals(Integer.valueOf(0))) {
                  bja.a(64, -37, -82, 75, -9, -121, -1, (byte[])null, (byte[])null);
               }

               for(int var12 = var8; var9 >= var12; ++var12) {
                  ((boolean[])((boolean[])var11[var12][0]))[0] = true;
               }
            }

            if(null != var5 && (var5.length == 18 && var5[14].equals(Integer.valueOf(0)) && var5[14].equals(Integer.valueOf(2)) || var5.length == 8 && var5[2].equals(Integer.valueOf(1)))) {
               a(-51, 0, var2, 24, 49, (Object[])null);
            }

         }
      }
   }

}
