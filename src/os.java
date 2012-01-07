import jaggl.OpenGL;

final class os {

   private Object[] f_i;
   static boolean j = false;
   static int f;
   static int d;
   static int h;
   static int a;
   static int g;
   static int f_l;
   static int c;
   static Object[] k = pl.a((byte)-23, new Object[3]);
   static Object[][] b = new Object[0][];
   static long e;


   static final Object[] a(int var0, byte var1) {
      ++f_l;
      if(var1 < 111) {
         e = ((long[])((long[])k[17]))[1];
      }

      Object[] var2 = (Object[])((Object[])dna.a((byte)34, ma.m, (long)var0));
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = qn.a(0, var0, ph.e, 81);
         var2 = jma.a((byte)-104, new Object[7]);
         if(var3 != null) {
            Object[] var4 = jta.a((byte)-116, var3, new Object[3]);

            while(true) {
               int var5 = fh.a(var4, false);
               if(var5 == 0) {
                  if(var2 != null && var2.length == 1 && var2[0].equals(Integer.valueOf(2))) {
                     ((long[])((long[])ma.m[0]))[26] = -72L;
                  }
                  break;
               }

               waa.a(var2, var5, (byte)86, var4);
            }
         }

         cv.a(var2, -19219);
         il.a((long)var0, var2, true, ma.m);
         return var2;
      }
   }

   static final Object[] a(int var0, Object[] var1) {
      if(var0 <= 72) {
         ((long[])((long[])k[13]))[6] = ((long[])((long[])k[8]))[13];
      }

      ++f;
      if(null == var1[0]) {
         var1[0] = new int[4];
      }

      return var1;
   }

   static final int a(Object[] var0, int var1) {
      if(var1 != -16726) {
         return ((int[])((int[])((Object[])((Object[])var0[0]))[0]))[1];
      } else {
         ++a;
         return ((byte[])((byte[])var0[0]))[0] & 7;
      }
   }

   static final void a(int var0, byte[] var1, Object[] var2, int var3) {
      if(var0 == 19) {
         lta.b(-32356, var2);
         ++g;
         if(((int[])((int[])var2[1]))[0] < var3) {
            OpenGL.glBufferDataARBub(((int[])((int[])var2[1]))[2], var3, var1, 0, ((boolean[])((boolean[])var2[3]))[0]?'\u88e0':'\u88e4');
            ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[19] += var3 + -((int[])((int[])var2[1]))[0];
            ((int[])((int[])var2[1]))[0] = var3;
         } else {
            OpenGL.glBufferSubDataARBub(((int[])((int[])var2[1]))[2], 0, var3, var1, 0);
         }

      }
   }

   static final void a(Object[] var0, boolean var1, boolean var2) {
      ++c;
      if(var0 != null && 8 == var0.length) {
         int var3 = sb.a(iia.r, (byte)-77, (Object[])((Object[])((Object[])((Object[])var0[1]))[2]), ((cga)var0[2]).f()) + ((int[])((int[])((Object[])((Object[])var0[1]))[1]))[2];
         int var4 = roa.a(qga.j, 2, ((cga)var0[2]).d(), (Object[])((Object[])((Object[])((Object[])var0[1]))[4])) + ((int[])((int[])((Object[])((Object[])var0[1]))[1]))[0];
         ((cga)var0[2]).a((float)(var3 + ((cga)var0[2]).f() / 2), (float)(((cga)var0[2]).d() / 2 + var4), 4096, ((int[])((int[])var0[5]))[0]);
         ((int[])((int[])var0[5]))[0] += ((int[])((int[])((Object[])((Object[])var0[1]))[1]))[3];
      } else {
         ul.a(var0, 0, var2);
         if(var1) {
            a(((int[])((int[])k[0]))[6], ((byte[])((byte[])var0[17]))[37]);
         }

      }
   }

   os(Object[] var1) {
      this.f_i = var1;
   }

   public final String toString() {
      ++d;
      return bl.a((byte)110, this.f_i);
   }

}
