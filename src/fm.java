
final class fm {

   private static int g;
   private static int e;
   private static int b;
   private static int h;
   private static int[] c;
   private static int f;
   private static int a;
   private static int d;


   private static final void a(int[] var0, int var1, int var2) {
      int var3 = h + (var2 << 1);
      int var5;
      if(c == null || c.length < var3) {
         int[] var4 = new int[var3];

         for(var5 = 0; var5 < h; ++var5) {
            var4[var5] = c[var5];
         }

         c = var4;
      }

      var2 += var1;
      int var8 = var2 - 2;

      for(var5 = var1; var5 < var2; var5 += 2) {
         int var6 = var0[var8 + 1];
         int var7 = var0[var5 + 1];
         if(var6 < var7) {
            c[h++] = var0[var8];
            c[h++] = var6;
            c[h++] = var0[var5];
            c[h++] = var7;
         } else if(var7 < var6) {
            c[h++] = var0[var5];
            c[h++] = var7;
            c[h++] = var0[var8];
            c[h++] = var6;
         }

         var8 = var5;
      }

   }

   private static final void a(int var0, int var1) {
      if(var1 > var0 + 4) {
         int var2 = var0;
         int var3 = c[var0];
         int var4 = c[var0 + 1];
         int var5 = c[var0 + 2];
         int var6 = c[var0 + 3];

         for(int var7 = var0 + 4; var7 < var1; var7 += 4) {
            int var8 = c[var7 + 1];
            if(var8 < var4) {
               c[var2] = c[var7];
               c[var2 + 1] = var8;
               c[var2 + 2] = c[var7 + 2];
               c[var2 + 3] = c[var7 + 3];
               var2 += 4;
               c[var7] = c[var2];
               c[var7 + 1] = c[var2 + 1];
               c[var7 + 2] = c[var2 + 2];
               c[var7 + 3] = c[var2 + 3];
            }
         }

         c[var2] = var3;
         c[var2 + 1] = var4;
         c[var2 + 2] = var5;
         c[var2 + 3] = var6;
         a(var0, var2);
         a(var2 + 4, var1);
      }
   }

   private static final void b(int var0, int var1) {
      while(true) {
         if(var1 >= var0 + 8) {
            boolean var2 = true;

            for(int var3 = var0 + 4; var3 < var1; var3 += 4) {
               int var4 = c[var3 - 4];
               int var5 = c[var3];
               if(var4 > var5) {
                  var2 = false;
                  c[var3 - 4] = var5;
                  c[var3] = var4;
                  var4 = c[var3 - 2];
                  c[var3 - 2] = c[var3 + 2];
                  c[var3 + 2] = var4;
                  var4 = c[var3 - 1];
                  c[var3 - 1] = c[var3 + 3];
                  c[var3 + 3] = var4;
               }
            }

            if(!var2) {
               var1 -= 4;
               continue;
            }
         }

         return;
      }
   }

   private static final boolean a(int var0) {
      int var1 = g;
      int var2 = f;
      int var3 = e;

      while(var2 >= var1) {
         ++var3;
         e = var3;
         if(var3 >= var0) {
            return false;
         }

         int var4 = a;

         while(true) {
            int var5;
            int var6;
            if(var1 < h) {
               var5 = c[var1 + 1];
               if(var3 >= var5) {
                  var6 = c[var1];
                  int var7 = c[var1 + 2];
                  int var8 = c[var1 + 3];
                  int var9 = (var7 - var6 << 16) / (var8 - var5);
                  int var10 = (var6 << 16) + '\u8000';
                  c[var1] = var10;
                  c[var1 + 2] = var9;
                  var1 += 4;
                  continue;
               }
            }

            for(var5 = var4; var5 < var1; var5 += 4) {
               var6 = c[var5 + 3];
               if(var3 >= var6) {
                  c[var5] = c[var4];
                  c[var5 + 1] = c[var4 + 1];
                  c[var5 + 2] = c[var4 + 2];
                  c[var5 + 3] = c[var4 + 3];
                  var4 += 4;
               }
            }

            if(var4 == h) {
               h = 0;
               return false;
            }

            b(var4, var1);
            a = var4;
            g = var1;
            var2 = var4;
            break;
         }
      }

      b = c[var2] >> 16;
      d = c[var2 + 4] >> 16;
      c[var2] += c[var2 + 2];
      c[var2 + 4] += c[var2 + 6];
      var2 += 8;
      f = var2;
      return true;
   }

   static final void a(ta var0, int[] var1, int var2, int[] var3, int[] var4) {
      a(var0, var1, 0, var1.length, var2, var3, var4);
   }

   private static final void a() {
      h = 0;
   }

   private static final void a(ta var0, int[] var1, int var2, int var3, int var4, int[] var5, int[] var6) {
      int[] var7 = new int[4];
      var0.TA(var7);
      if(var5 != null && var7[3] - var7[1] != var5.length) {
         throw new IllegalStateException();
      } else {
         a();
         a(var1, var2, var3);
         b(var7[1]);

         while(a(var7[3])) {
            int var8 = b;
            int var9 = d;
            int var10 = e;
            if(var5 != null) {
               int var11 = var10 - var7[1];
               if(var8 < var5[var11] + var7[0]) {
                  var8 = var5[var11] + var7[0];
               }

               if(var9 > var5[var11] + var6[var11] + var7[0]) {
                  var9 = var5[var11] + var6[var11] + var7[0];
               }

               if(var9 - var8 <= 0) {
                  continue;
               }
            }

            var0.T(var8, var10, var9 - var8, var4, 1);
         }

      }
   }

   private static final void b(int var0) {
      if(h < 0) {
         f = 0;
         g = 0;
         a = 0;
         e = 2147483646;
      } else {
         a(0, h);
         int var1 = c[1];
         if(var1 < var0) {
            var1 = var0;
         }

         byte var2 = 0;

         int var3;
         for(var3 = 0; var3 < h; var3 += 4) {
            int var4 = c[var3 + 1];
            if(var1 < var4) {
               break;
            }

            int var5 = c[var3];
            int var6 = c[var3 + 2];
            int var7 = c[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + '\u8000';
            c[var3] = var9 + (var1 - var4) * var8;
            c[var3 + 2] = var8;
         }

         a = var2;
         g = var3;
         f = var3;
         e = var1 - 1;
      }
   }

   static final void a(ta var0, int[] var1, int var2) {
      a(var0, var1, 0, var1.length, var2, (int[])null, (int[])null);
   }
}
