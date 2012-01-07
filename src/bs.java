
final class bs extends lm {

   static int r;
   static int n;
   static int p;
   Object[] o;
   static int j;
   static int q;
   static Object[] m = ed.a(-1, new Object[1], (byte)-108, 38);
   static int[] k;
   static Object[] f_l = ed.a(7, new Object[1], (byte)-119, 122);


   static final void b(boolean var0) {
      if(var0) {
         ju.g = sr.e;
         jp.o = wd.a;
      } else {
         ju.g = fo.f_i;
         jp.o = bf.f_l;
      }

      ri.n = ju.g.length;
   }

   static final Object[] a(Object[] var0, int var1, int var2) {
      ++r;
      if(null != var0 && var0.length == 14) {
         return null;
      } else {
         Object[] var3;
         synchronized(var0[1]) {
            var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var0[1]), (long)var2));
         }

         if(var3 == null) {
            byte[] var4;
            Object[] var6;
            synchronized(var0[0]) {
               var6 = (Object[])((Object[])var0[0]);
               int var7 = var2 >>> 7;
               var4 = qn.a(var7, qma.a(var2, (byte)105), var6, var1 - 93);
            }

            var6 = new Object[10];
            bra.a(true, var6);
            br.a(var6, -15536);
            var3 = var6;
            ((int[])((int[])var6[1]))[3] = var2;
            if(var4 != null) {
               lca.a(jta.a((byte)-117, var4, new Object[3]), (int)256, var6);
            }

            ue.a(var6, true);
            synchronized(var0[1]) {
               il.a((long)var2, var3, true, (Object[])((Object[])var0[1]));
               if(var1 != -15) {
                  k = (int[])null;
               }

               return var3;
            }
         } else {
            return var3;
         }
      }
   }

   static final int a(boolean var0, Object[] var1, Object[] var2, int var3, boolean var4, int var5, boolean var6) {
      ++p;
      int var7 = go.a(-124, var3, var4, var2, var1);
      if(0 != var7) {
         return !var4?var7:-var7;
      } else if(var6) {
         return 44;
      } else if(-1 != var5) {
         int var8 = go.a(-107, var5, var0, var2, var1);
         return var0?-var8:var8;
      } else {
         return 0;
      }
   }

   static final void a(int var0, byte var1, int var2, Object[] var3, int[] var4) {
      ++j;
      var4[1] = -((int[])((int[])var3[1]))[5] - (-((int[])((int[])var3[1]))[2] - var0);
      if(var1 == 33) {
         var4[0] = 0;
         var4[2] = var2 + ((int[])((int[])var3[1]))[8] + -((int[])((int[])var3[1]))[3];
      }
   }

   bs(Object[] var1) {
      this.o = var1;
   }

   static final void c(boolean var0) {
      ++q;
      if(!gpa.a) {
         fja.d += (24.0F - fja.d) / 2.0F;
         gpa.a = true;
         aoa.b = true;
         if(var0) {
            m[0] = (Object)null;
         }

      }
   }

   static final int[][] a(int var0, Object[] var1) {
      try {
         ++n;
         if(((int[])((int[])var1[1]))[3] != ((int[])((int[])var1[1]))[var0]) {
            throw new RuntimeException();
         } else {
            if(var1 != null && 6 == var1.length) {
               oqa.a((Object[])null, 103, -71, 28, 0);
            }

            for(int var2 = 0; ((int[])((int[])var1[1]))[2] > var2; ++var2) {
               ((Object[][])((Object[][])var1[2]))[var2] = fca.g;
            }

            return (int[][])((int[][])var1[3]);
         }
      } catch (RuntimeException var3) {
         throw vt.a(var3, "bs.C(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

}
