import jaclib.memory.heap.NativeHeap;

final class mna {

   static int f;
   static int e;
   static int d;
   static int f_i;
   static int b;
   static int c;
   static Object[] a = ura.a(-64, new Object[2]);
   static int g;
   static String h;


   static final void c(Object[] var0, int var1) {
      if(var1 > -37) {
         a(((byte[])((byte[])var0[1]))[7]);
      }

      ++g;
      ((NativeHeap)var0[1]).a();
   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      ((float[])((float[])var2[1]))[1] += ((float[])((float[])var1[1]))[1];
      ++f_i;
      ((float[])((float[])var2[var0]))[0] += ((float[])((float[])var1[1]))[0];
      ((float[])((float[])var2[1]))[2] += ((float[])((float[])var1[1]))[2];
   }

   static final void a(int var0) {
      if(var0 == 0) {
         if(bq.e == 2) {
            sc.b[0].a(ar.b[0]);
            sc.b[1].a(ar.b[1]);
         } else if(bq.e == 3) {
            sc.b[0].a(ar.b[0]);
            sc.b[1].a(ar.b[1]);
            sc.b[2].a(ar.b[2]);
         } else {
            sc.b[0].a(ar.b[0]);
            sc.b[1].a(ar.b[1]);
            sc.b[2].a(ar.b[2]);
            sc.b[3].a(ar.b[3]);
         }
      } else if(var0 == 1) {
         if(bq.e == 2) {
            sc.b[0].a(ar.b[2]);
         } else if(bq.e == 3) {
            sc.b[0].a(ar.b[3]);
            sc.b[1].a(ar.b[4]);
         } else {
            sc.b[0].a(ar.b[4]);
            sc.b[1].a(ar.b[5]);
            sc.b[2].a(ar.b[6]);
         }
      } else if(var0 == 2) {
         if(bq.e == 2) {
            sc.b[0].a(ar.b[3]);
         } else if(bq.e == 3) {
            sc.b[0].a(ar.b[5]);
         } else {
            sc.b[0].a(ar.b[7]);
         }
      }

   }

   static final fk a(int var0, Object[] var1) {
      int var2 = -16 % ((-6 - var0) / 58);
      ++f;
      return new fk(var1);
   }

   static final void a(Object[] var0, int var1) {
      ++b;
      Object[] var2 = za.a(ofa.e[((int[])((int[])var0[0]))[1]], (byte)93);
      if(-1 == ~((int[])((int[])var0[0]))[3]) {
         aj.a(var2, (int[])((int[])var0[5]), 0, var1 ^ -2866, false);
      } else {
         ora.a(new int[]{((int[])((int[])var0[0]))[3]}, new int[]{((int[])((int[])var0[0]))[2]}, new int[]{0}, var2, 18784);
      }

      if(var1 != 2898) {
         ((byte[])((byte[])a[2]))[8] = 59;
      }

   }

   static final void a(byte var0) {
      ++e;
      if(var0 > 15) {
         Object[] var1 = jr.d;
         synchronized(jr.d) {
            jr.d = aqa.a(new Object[2], 52);
            af.D = 0;
         }
      }
   }

   static final void a(byte var0, Object[] var1) {
      synchronized(var1[0]) {
         lga.b(var0 ^ -14, (Object[])((Object[])var1[0]));
      }

      ++d;
      if(var0 != -14) {
         ((long[])((long[])((Object[])((Object[])var1[27]))[4]))[4] = -116L;
      }

   }

   static final void b(Object[] var0, int var1) {
      if(null == var0[1]) {
         var0[1] = new int[1];
      }

      if(var0[12] == null) {
         var0[12] = new long[1];
      }

      int var2 = 36 % ((11 - var1) / 47);
      ++c;
   }

}
