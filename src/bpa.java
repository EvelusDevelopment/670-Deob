import java.io.IOException;
import java.io.RandomAccessFile;

final class bpa {

   static int b;
   static int f_i;
   static int g;
   static int a;
   static int k;
   static int j;
   private Object[] f;
   static int f_l;
   static int c;
   static int e;
   static Object[][] d = new Object[37][];
   static int h;


   static final void a(Object[] var0, byte var1, Object[] var2) {
      if(var1 <= 44) {
         a(110, (Object)null);
      }

      ++c;
      if(var2 != null && -88 == ~var2.length) {
         vta.a((Object[])((Object[])var2[79]), var0, 79);
      } else if(null != var2 && var2.length == 91) {
         dla.a(1, var0, var2);
      } else {
         throw new IllegalStateException();
      }
   }

   public final String toString() {
      ++f_l;
      Object[] var2 = this.f;
      StringBuffer var3 = new StringBuffer();

      for(int var4 = 0; 4 > var4; ++var4) {
         if(var2 != null && (var2.length == 7 && var2[6].equals(Boolean.valueOf(false)) && var2[6].equals(Integer.valueOf(1)) || 4 == var2.length)) {
            this.toString();
         }

         for(int var5 = 0; var5 < 4; ++var5) {
            if(0 < var5) {
               var3.append("\t");
            }

            var3.append(((float[])((float[])var2[0]))[var5 + 4 * var4]);
         }

         var3.append("\n");
      }

      String var1 = var3.toString();
      if(var2 != null && var2.length == 6) {
         this.equals((Object)null);
      }

      return var1;
   }

   static final Object[] a(Object[] var0, byte var1, int var2, int var3, int var4, int var5) {
      ++b;
      Object[] var6 = null;
      if(var4 == 0) {
         var6 = cu.a(var5, var2, var3);
      }

      if(var4 == 1) {
         var6 = kaa.a(var5, var2, var3);
      }

      if(var4 == 2) {
         var6 = InputStreamWorker.a(var5, var2, var3, ke.f);
      }

      if(3 == var4) {
         var6 = cba.a(var5, var2, var3);
      }

      if(var1 >= -22) {
         ((boolean[])((boolean[])var0[5]))[4] = false;
      }

      return var6;
   }

   static final Object[] a(int var0, Object var1) {
      if(var0 != 9603) {
         a(new Object[16], (byte)-12, 64, -44, -116, 43);
      }

      ++j;
      return var1 instanceof qaa?((qaa)var1).m:null;
   }

   static final boolean a(ta var0, int var1, int var2, Object[] var3, int var4) {
      ++a;
      if(var4 != 25892) {
         return true;
      } else {
         Object[] var5 = var0.k();
         kqa.a(woa.a(var4 - 25887, var3), true, var5);
         cq.a((byte)81, 0.0F, -10.0F, 0.0F, var5);
         ka var6 = woa.a((Object[])null, ((int[])((int[])var3[12]))[4], us.a(((int[])((int[])var3[12]))[10], (byte)25, cqa.a), (Object[])null, var0, false, 131072);
         if(var6 != null && var6.a(var2, var1, var5, true, 0)) {
            return true;
         } else {
            if(~((int[])((int[])var3[12]))[6] != 0) {
               var6 = woa.a((Object[])null, ((int[])((int[])var3[12]))[7], us.a(((int[])((int[])var3[12]))[6], (byte)91, cqa.a), (Object[])null, var0, false, 131072);
               if(var6 != null && var6.a(var2, var1, var5, true, 0)) {
                  return true;
               }
            }

            if(((int[])((int[])var3[12]))[9] != -1) {
               var6 = woa.a((Object[])null, ((int[])((int[])var3[12]))[5], us.a(((int[])((int[])var3[12]))[9], (byte)85, cqa.a), (Object[])null, var0, false, 131072);
               if(null != var6 && var6.a(var2, var1, var5, true, 0)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public final boolean equals(Object var1) {
      ++h;
      Object[] var3 = this.f;
      if(var3 != null && var3.length == 5) {
         this.toString();
      }

      boolean var2;
      bpa var5;
      if(var1 instanceof bpa && null != ((var5 = (bpa)var1) != null?var5.f:null)) {
         bpa var6;
         Object[] var8 = null != (var6 = (bpa)var1)?var6.f:null;
         int var9 = 0;

         while(true) {
            if(16 > var9) {
               if(((float[])((float[])var8[0]))[var9] == ((float[])((float[])var3[0]))[var9]) {
                  ++var9;
                  continue;
               }

               var2 = false;
               break;
            }

            var2 = true;
            break;
         }
      } else {
         var2 = false;
      }

      return var2;
   }

   bpa(Object[] var1) {
      this.f = var1;
   }

   static final int a(int var0, byte var1, Object[] var2, byte[] var3, int var4) throws IOException {
      ++g;
      if(var1 != 34) {
         d = (Object[][])((Object[][])null);
      }

      int var5 = ((RandomAccessFile) var2[2]).read(var3, var4, var0);
      if(var5 > 0) {
         ((long[])((long[])var2[1]))[1] += (long)var5;
      }

      return var5;
   }

   static final float a(byte var0, Object[] var1, float var2) {
      if(var0 != -58) {
         a(((byte[])((byte[])var1[0]))[1], (Object[])null, 0.61416864F);
      }

      ++e;
      return vea.a((byte)-36, var1, var2);
   }

   static final void a(int var0, Object[] var1) {
      if(var1[1] == null) {
         var1[1] = new int[2];
      }

      ++f_i;
      if(var0 != 18917) {
         a((byte)124, (Object[])null, -0.7116766F);
      }

   }

}
