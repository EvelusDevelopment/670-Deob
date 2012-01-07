import java.io.File;
import java.util.BitSet;

final class av {

   static int g;
   static int d;
   static File c;
   static int a;
   static int h;
   static int f;
   static int e;
   static int b;


   static final void a(Object[] var0, int var1) {
      ++h;
      if(var0[7] == null) {
         throw new vb();
      } else {
         dra.a((Object[])((Object[])var0[8]), false, ((long[])((long[])((Object[])((Object[])var0[7]))[6]))[0]);
         mm.a((Object[])((Object[])var0[8]), ((long[])((long[])((Object[])((Object[])var0[7]))[6]))[1], (byte)106);
         ((boolean[])((boolean[])var0[6]))[0] = true;
         ((Object[])((Object[])var0[var1]))[82] = var0[7];
      }
   }

   static final void a(Object[] var0, int var1, Object[] var2, int var3) {
      if(var3 != 1) {
         a(false, (Object[])((Object[])((Object[])((Object[])var2[5]))[1]), ((int[])((int[])var0[1]))[5]);
      }

      if(var1 != 2) {
         if(1 == var1) {
            ((int[])((int[])var2[1]))[3] = de.a((int)0, var0);
         } else if(0 == var1) {
            ((int[])((int[])var2[1]))[4] = de.a((int)0, var0);
         }
      } else {
         ((int[])((int[])var2[1]))[2] = de.a((int)0, var0);
      }

      ++g;
   }

   static final void a(int var0, int var1, int var2, Object[] var3, int var4) {
      ++d;
      th.a((Object[])((Object[])var3[0]), var1, (byte)-100);
      oca.a(-117, var2, (Object[])((Object[])var3[var4]));
      vh.putIntLE(var4 + 0, (Object[])((Object[])var3[0]), var0);
   }

   static final void a(boolean var0, Object[] var1, int var2) {
      ++f;
      ((boolean[])((boolean[])var1[63]))[3] = var0;
      if(var2 != 0) {
         a(-121, (Object[])((Object[])var1[2]));
      }

      me.a(77, var1);
   }

   static final Object[] a(Object[] var0, Object[] var1, byte var2) {
      ++a;
      int var3 = -21 / ((var2 - 26) / 39);
      aa.a(15022, var0, var1);
      return var1;
   }

   static final boolean a(int var0, Object[] var1) {
      ++e;
      if(null != var1 && var1.length == 1 && var1[0].equals(Integer.valueOf(2)) && var1[0].equals(Integer.valueOf(2))) {
         ((byte[])((byte[])ria.a[6]))[0] = ((byte[])((byte[])ria.a[4]))[1];
      }

      if(var1[11] == null) {
         return ~((int[])((int[])var1[1]))[0] != 0 || null != var1[9];
      } else {
         for(int var2 = var0; ~var2 > ~((int[])((int[])var1[11])).length; ++var2) {
            if(0 != ~((int[])((int[])var1[11]))[var2]) {
               Object[] var3 = mca.a(true, ((int[])((int[])var1[11]))[var2], (Object[])((Object[])var1[7]));
               if(0 != ~((int[])((int[])var3[1]))[0] || null != var3[9]) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   static {
      new BitSet(65536);
   }
}
